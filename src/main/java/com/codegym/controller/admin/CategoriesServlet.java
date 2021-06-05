package com.codegym.controller.admin;
import com.codegym.dao.impl.CategoryDAO;
import com.codegym.model.CategoryModel;
import com.codegym.service.CategoryService;
import com.codegym.service.impl.CategoryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CategoriesServlet", value = "/admin-categories")
public class CategoriesServlet extends HttpServlet {
    CategoryService categoryService = new CategoryServiceImpl();
    CategoryDAO categoryDAO = new CategoryDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showFormEdit":
//                int id = Integer.parseInt(req.getParameter("id"));
                CategoryModel categoryModel = categoryService.findById(req, resp);
                req.setAttribute("category", categoryModel);
                req.getRequestDispatcher("/AdminTeamplate/editCategoryForm.jsp").forward(req, resp);
                break;
            case "create":
                req.getRequestDispatcher("/AdminTeamplate/item-editor-category.jsp").forward(req, resp);
////                findA(req, resp, categoryService, "/category/listcategory.jsp");
//                resp.sendRedirect(req.getContextPath() + "/admin-categories");
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
                findA(req, resp, categoryService, "/AdminTeamplate/items-list-category.jsp");
                break;

        }
    }

    private void findA(HttpServletRequest req, HttpServletResponse resp, CategoryService categoryService, String path) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.findAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
        requestDispatcher.forward(req,resp);
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
                resp.sendRedirect(req.getContextPath() + "/admin-categories");
                break;
            case "delete":
                categoryService.delete(req);
                findA(req, resp, categoryService, "/category/listcategory.jsp");
                break;
            case "update":
                categoryService.update(req);
                resp.sendRedirect(req.getContextPath() + "/admin-categories");
                break;
            case "findById":
                categoryService.findByIdCategory(req,resp);
                req.getRequestDispatcher("/category/moviesOrCategory.jsp").forward(req,resp);
                break;
            default:
                findA(req, resp, categoryService, "/AdminTeamplate/items-list-category.jsp");
        }
    }
}
