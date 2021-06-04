package com.codegym.controller.admin;

import com.codegym.model.MovieModel;
import com.codegym.service.CategoryService;
import com.codegym.service.IMovieService;
import com.codegym.service.impl.CategoryServiceImpl;
import com.codegym.service.impl.MovieService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MoviesServlet", urlPatterns = "/MovieServlet")
public class MoviesServlet extends HttpServlet {
    private static IMovieService movieService = new MovieService();
    private static CategoryService categoryService = new CategoryServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }switch (action) {
            case "create":
                showFormCreate(req, resp);
                break;
            default:
                showAll(req, resp);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("movie/createMovie");
            req.setAttribute("categories",categoryService.findAll());
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAll(HttpServletRequest req, HttpServletResponse resp) {
        List<MovieModel> movieModels = movieService.selectAll();
        req.setAttribute("listMovie", movieModels);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("show.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewMovie(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/item-editor.jsp");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String description = req.getParameter("description");
        String image = req.getParameter("image");
        String trainer = req.getParameter("trainer");
        String  movie = req.getParameter("movie");
        String[] categoriesSr = req.getParameterValues("categories");
        int[] categories = new int[categoriesSr.length];
        for (int i = 0; i < categoriesSr.length ; i++) {
            categories[i] = Integer.parseInt(categoriesSr[i]);
        }
        MovieModel movieModel = new MovieModel(title,content,description,image,trainer,movie);
        movieService.insert(movieModel,categories);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewMovie(req, resp);
                break;
            default:
                showAll(req,resp);
        }
    }
}
