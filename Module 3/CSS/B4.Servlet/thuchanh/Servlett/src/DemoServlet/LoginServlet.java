package DemoServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/info")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        if ("vietvu".equals(name) && "123456".equals(pass)) {
            request.setAttribute("username", name);
            request.getRequestDispatcher("jsp/success.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("jsp/faild.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/hello.jsp").forward(request,response);
    }
}
