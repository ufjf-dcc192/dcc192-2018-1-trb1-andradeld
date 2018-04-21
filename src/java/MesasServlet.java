import Classes.Mesa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MesasServlet"})
public class MesasServlet extends HttpServlet {

    List<Mesa> mesas = new ArrayList<>();
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Mesa mesa1 = new Mesa(1, true, null);
            
            mesas.add(mesa1);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MesaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hamburguer daKsa</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
