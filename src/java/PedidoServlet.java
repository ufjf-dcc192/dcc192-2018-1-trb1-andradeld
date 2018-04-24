
import Classes.ItensDisponiveis;
import Classes.Pedido;
import Classes.PedidosAbertos;
import Classes.Produto;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/add_produto_pedido.html", "/listar_pedidos.html", "/abrir_pedido.html"})
public class PedidoServlet extends HttpServlet {

    List<Pedido> pedidos = PedidosAbertos.getInstance();
    List<Produto> produto = ItensDisponiveis.getInstance();
    String produtoNome;
    double preco;
    int cod_ped;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (null != request.getServletPath()) {
            switch (request.getServletPath()) {
                case "/listar_pedidos.html":
                    listarPedido(request, response);
                    break;
                case "/abrir_pedido.html":
                    abrirPedido(request, response);
                    break;
                case "/add_produto_pedido.html":
                    addItem(request, response);
                    break;
                default:
                    break;
            }
        }
    }

    private void abrirPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pedidos.add(new Pedido());
        request.setAttribute("pedidos", pedidos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedidos.jsp");
        despachante.forward(request, response);

    }

    private void addItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazer-pedido.jsp");
        despachante.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cod_ped = Integer.parseInt(request.getParameter("cod_ped"));
        int cod_prod = Integer.parseInt(request.getParameter("cod_prod"));
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getCod_prod() == cod_prod) {
                produtoNome = produto.get(i).getNome_item();
                preco = produto.get(i).getPreco_item();
                break;
            }
        }

        Produto pr1 = (new Produto(cod_prod, produtoNome, preco));

        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getNum_ped() == cod_ped) {
                pedidos.get(i).getProdutos().add(pr1);
                break;
            }
        }

        response.sendRedirect("index.html");

    }

    private void listarPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("pedidos", pedidos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedidos.jsp");
        despachante.forward(request, response);
    }

}
