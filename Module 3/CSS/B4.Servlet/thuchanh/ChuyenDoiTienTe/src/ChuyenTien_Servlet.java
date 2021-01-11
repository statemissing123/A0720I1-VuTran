import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChuyenTien_Servlet",urlPatterns = "/rate")
public class ChuyenTien_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rateVND = request.getParameter("rate");
        String rateUSD = request.getParameter("usd");
        float vnd = Float.parseFloat(rateVND);
        float usd = Float.parseFloat(rateUSD);
        float rate = vnd/23000;
        request.setAttribute("rateAmerica",rate);
        request.getRequestDispatcher("WEB-INF/jsp/formCt.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rateAmerica",0);
        request.getRequestDispatcher("WEB-INF/jsp/formCt.jsp").forward(request,response);
    }
}
