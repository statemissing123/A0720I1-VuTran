package controller;

import model.ProductManga;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductManGaServlet", urlPatterns = "/product")
public class ProductManGaServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductManga> productMangas = this.productService.findAll();
        request.setAttribute("productMangas", productMangas);
        request.getRequestDispatcher("jsp/product/list.jsp").forward(request, response);
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductManga productManga = this.productService.findById(id);
        request.setAttribute("productManga",productManga);
        request.getRequestDispatcher("jsp/product/view.jsp").forward(request,response);
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                viewProduct(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }
}
