import Classes.Pedido;
import Classes.PedidosAbertos;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/pedido.html","/iniciar.html"})
public class PedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/pedido.html".equals(request.getServletPath())) {
            listarPedido(request, response);
        } else
            if ("/iniciar.html".equals(request.getServletPath())) {
            abrirPedido(request, response);
        }
    }

    private void listarPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         //   List<Produto> pedidos = Pedido.getInstance();
            //despachante
        //    request.setAttribute("produtos", pedidos);
         //   RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedido.jsp");
         //   despachante.forward(request, response);

    }
    
    private void abrirPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Pedido> pedidos = PedidosAbertos.getInstance();
            //despachante
            request.setAttribute("pedidos", pedidos);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedido.jsp");
            despachante.forward(request, response);

    }
    
}
