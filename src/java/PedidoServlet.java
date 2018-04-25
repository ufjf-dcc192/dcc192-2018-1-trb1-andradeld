
import Classes.ItensDisponiveis;
import Classes.Mesa;
import Classes.MesasDisponiveis;
import Classes.Pedido;
import Classes.PedidosAbertos;
import Classes.Produto;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/add_produto_pedido.html", "/exibir_pedido.html", "/listar_pedidos.html", "/novo_pedido.html", "/fechar_pedido.html.html"})
public class PedidoServlet extends HttpServlet {

    List<Pedido> pedidos = PedidosAbertos.getInstance();
    List<Produto> produto = ItensDisponiveis.getInstance();
    List<Mesa> mesas = MesasDisponiveis.getInstance();
    String produtoNome;
    double preco;
    int cod_ped;
    
    Calendar calendar = new GregorianCalendar();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (null != request.getServletPath()) {
            switch (request.getServletPath()) {
                case "/listar_pedidos.html":
                    listarPedido(request, response);
                    break;
                case "/novo_pedido.html":
                    novoPedido(request, response);
                    break;
                case "/add_produto_pedido.html":
                    addItem(request, response);
                    break;
                case "/fechar_pedido.html.html":
                    fecharPedido(request, response);
                    break;
                case "/exibir_pedido.html.html":
                    exibirPedido(request, response);
                    break; 
                default:
                    break;
            }
        }
    }

    private void novoPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //criando pedido
        Pedido p = new Pedido();
        pedidos.add(p);
        //criando e alterando data
        Date date = new Date();
        calendar.setTime(date);
        p.setData_abertura_ped(calendar.getTime());
        p.setAberto_ped(true);
        //verificando mesa disponivel
        for (int i = 0; i<mesas.size(); i++){
            if(mesas.get(i).isDisponivel_mesa() == true){
                p.setNum_mesa(i);
                mesas.get(i).setDisponivel_mesa(false);
                request.setAttribute("pedidos", pedidos);
                request.setAttribute("cod_ped", i);
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/exibir-pedido.jsp");
                despachante.forward(request, response);
            } else {
                
            }
        }
            //Não tem mesas disponiveis, aguarde...
            response.sendRedirect("index.html");
        

    }

    private void addItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Produto> produtos = ItensDisponiveis.getInstance();
        request.setAttribute("produtos", produtos);
        
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
    
    private void fecharPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // request.setAttribute("pedidos", pedidos);
       // RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedidos.jsp");
       // despachante.forward(request, response);
       response.sendRedirect("index.html");
    }
    
    private void exibirPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("pedidos", pedidos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/exibir-pedido.jsp");
        despachante.forward(request, response);
    }
}
