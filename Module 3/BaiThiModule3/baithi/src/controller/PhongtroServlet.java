package controller;

import model.Phongtro;
import service.IPhongtroService;
import service.impl.PhongtroImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhongtroServlet", urlPatterns = "/phongtro")
public class PhongtroServlet extends HttpServlet {
    private IPhongtroService phongtroService = new PhongtroImpl();

    private void listPhongtro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Phongtro> phongtros = this.phongtroService.findAll();
        request.setAttribute("phongtros", phongtros);
        request.getRequestDispatcher("jsp/list.jsp").forward(request, response);
    }

    private void xoaphongtro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.phongtroService.remove(id);
        listPhongtro(request, response);
    }

    private void taoPhongtro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String maphongtro = request.getParameter("maphongtro");
        String ten = request.getParameter("ten");
        String sdt = request.getParameter("sdt");
        String thanhtoan = request.getParameter("thanhtoan");
        String ngayThue = request.getParameter("ngaythue");
        String ghichu = request.getParameter("ghichu");
        Phongtro phongtro = new Phongtro(id, maphongtro, ten, sdt, ngayThue, thanhtoan, ghichu);
        this.phongtroService.insertPhongtro(phongtro);
        listPhongtro(request, response);
    }

    private void xemTaoPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/create.jsp").forward(request, response);
    }

    private void timkiemPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("name").trim();
        List<Phongtro> phongtroList = ten == null ? phongtroService.findAll() : phongtroService.findByName(ten);
        request.setAttribute("phongtros", phongtroList);
        request.getRequestDispatcher("jsp/list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                taoPhongtro(request, response);
                break;
            case "search":
                timkiemPhongTro(request, response);
                break;
            default:
                listPhongtro(request, response);
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
                xemTaoPhongTro(request, response);
                break;
            case "delete":
                xoaphongtro(request, response);
                break;
            default:
                listPhongtro(request, response);
                break;
        }
    }
}
