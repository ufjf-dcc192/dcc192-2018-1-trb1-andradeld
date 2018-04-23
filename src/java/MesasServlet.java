import Classes.Mesa;
import Classes.MesasDisponiveis;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/mesa.html"})
public class MesasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/mesa.html".equals(request.getServletPath())) {
            listarMesas(request, response);
        } 
    }

    private void listarMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            List<Mesa> mesas = MesasDisponiveis.getInstance();
            //despachante
            request.setAttribute("mesas", mesas);
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-mesas.jsp");
            despachante.forward(request, response);

    }
}
