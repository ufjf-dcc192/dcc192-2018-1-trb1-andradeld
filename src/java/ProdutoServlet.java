
import Classes.ItensDisponiveis;
import Classes.Produto;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/listar_produtos.html"})
public class ProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/listar_produtos.html".equals(request.getServletPath())) {
            listarProduto(request, response);
        }
    }

    private void listarProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Produto> produtos = ItensDisponiveis.getInstance();
        request.setAttribute("produtos", produtos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-produtos.jsp");
        despachante.forward(request, response);

    }
}
