package com.codegym.controller.admin;
import com.codegym.service.CategoryService;
import com.codegym.service.impl.CategoryServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CategoriesServlet", value = "/admin-categories")
public class CategoriesServlet extends HttpServlet {
    CategoryService categoryService = new CategoryServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                categoryService.save(req, resp);
                req.getRequestDispatcher("/category/createcategory.jsp").forward(req, resp);
                break;
            case "delete":
                categoryService.delete(req);
                resp.sendRedirect("/admin-categories");
                break;
            case "update":
                categoryService.update(req);
                req.getRequestDispatcher("/category/updatecategory.jsp");
                break;
            default:
                findALL(req, resp, categoryService, "/category/listcategory.jsp");
        }
    }

    private void findALL(HttpServletRequest req, HttpServletResponse resp, CategoryService categoryService, String path) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.findAll());
        req.getRequestDispatcher(path).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                categoryService.save(req, resp);
                findALL(req, resp, categoryService, "/category/listcategory.jsp");

                break;
            case "delete":
                categoryService.delete(req);
                findALL(req, resp, categoryService, "/category/listcategory.jsp");

                break;
            case "update":
                categoryService.update(req);
                findALL(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            default:
                findALL(req, resp, categoryService, "/category/listcategory.jsp");
        }
    }
}
