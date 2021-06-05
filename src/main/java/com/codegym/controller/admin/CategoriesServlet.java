package com.codegym.controller.admin;
import com.codegym.model.CategoryModel;
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
            case "showFormEdit":
                CategoryModel categoryModel = categoryService.findById(req,resp);
                req.setAttribute("category", categoryModel);
                req.getRequestDispatcher("/category/updatecategory.jsp").forward(req, resp);
                break;
            case "create":
                categoryService.save(req, resp);
                req.getRequestDispatcher("/category/createcategory.jsp").forward(req, resp);
                findA(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            case "delete":
                categoryService.delete(req);
                resp.sendRedirect("/admin-categories");
                break;
            case "update":
                categoryService.update(req);
                resp.sendRedirect("/admin-categories");
                break;
            case "findById":
                req.setAttribute("categories", categoryService.findByIdCategory(req, resp));
                req.getRequestDispatcher("/category/moviesOrCategory.jsp").forward(req, resp);
                break;
            default:
                findA(req, resp, categoryService, "/category/listcategory.jsp");

        }
    }

    private void findA(HttpServletRequest req, HttpServletResponse resp, CategoryService categoryService, String path) throws ServletException, IOException {
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
                findA(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            case "delete":
                categoryService.delete(req);
                findA(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            case "update":
                categoryService.update(req);
                findA(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            case "findById":
                categoryService.findByIdCategory(req,resp);
                req.getRequestDispatcher("/category/moviesOrCategory.jsp").forward(req,resp);
                break;
            default:
                findA(req, resp, categoryService, "/category/listcategory.jsp");
        }
    }
}
