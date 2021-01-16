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
        request.setAttribute("productManga", productManga);
        request.getRequestDispatcher("jsp/product/view.jsp").forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.remove(id);
        listProduct(request,response);
    }
    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameManga = request.getParameter("nameManga");
        String author = request.getParameter("author");
        String nation = request.getParameter("nation");
        String episodes = request.getParameter("episodes");
        ProductManga productManga = new ProductManga(id, nameManga, author, nation,episodes);
        this.productService.update(id,productManga);
        listProduct(request, response);
    }
    private void viewEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductManga productManga = this.productService.findById(id);
        request.setAttribute("productManga",productManga);
        request.getRequestDispatcher("jsp/product/edit.jsp").forward(request,response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameManga = request.getParameter("nameManga");
        String author = request.getParameter("author");
        String nation = request.getParameter("nation");
        String episodes = request.getParameter("episodes");
        ProductManga productManga = new ProductManga(id, nameManga, author, nation,episodes);
        this.productService.save(productManga);
        listProduct(request, response);
    }
    private void viewCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/product/create.jsp").forward(request,response);
    }
    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameManga = request.getParameter("name");
        List<ProductManga> productMangaList = nameManga == null ? productService.findAll() : productService.findByName(nameManga);
        if (productMangaList.size() == 0) {
            response.setContentType("text/plain");
            response.getWriter().write("not found");
            return;
        }
        request.setAttribute("productMangas", productMangaList);
        request.getRequestDispatcher("jsp/product/result.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
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
                viewCreateProduct(request,response);
                break;
            case "edit":
                viewEditProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "view":
                viewProduct(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }
}
