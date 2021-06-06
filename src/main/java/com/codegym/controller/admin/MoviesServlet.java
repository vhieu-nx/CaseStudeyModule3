package com.codegym.controller.admin;

import com.codegym.model.CategoryModel;
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
import java.util.ArrayList;
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
        }
        switch (action) {
            case "create":
                showFormCreate(req, resp);
                break;
            case "edit":
                showFormEdit(req, resp);
                break;
            case "delete":
                deleteMovie(req, resp);
                break;
            case "search":
                searchMovieByTitle(req, resp);
                break;
            default:
                showAll(req, resp);
                break;
        }
    }

    private void showAllMovieID(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        List<MovieModel> movieModels = movieService.selectAllByMoveId(id);
        req.setAttribute("listMovie", movieModels);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/DetailsMovies");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchMovieByTitle(HttpServletRequest req, HttpServletResponse resp) {
        String searchValue = req.getParameter("txtSearchValue");
        List<MovieModel> movieModels = movieService.selectUserByName(searchValue);
        req.setAttribute("listMovie", movieModels);
        try {
            resp.sendRedirect(req.getContextPath() + "/MovieServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteMovie(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        movieService.delete(id);
        try {
            resp.sendRedirect(req.getContextPath() + "/MovieServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        MovieModel movieModel = movieService.selectUserByID(id);
        List<CategoryModel> categoryModels = categoryService.findAll();
        List<CategoryModel> categoryModelsOfMovie = movieService.getCategoryByMovieId(id);
        req.setAttribute("movies", movieModel);
        req.setAttribute("categories", categoryModels);
        req.setAttribute("categoriesOfMovie", categoryModelsOfMovie);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/EditFormMovie.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        List<CategoryModel> categoryModels = categoryService.findAll();
        req.setAttribute("categories", categoryModels);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/item-editor.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAll(HttpServletRequest req, HttpServletResponse resp) {
        List<MovieModel> movieModels = movieService.selectAll();
        req.setAttribute("listMovie", movieModels);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/items-list.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewMovie(HttpServletRequest req, HttpServletResponse resp) {


        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String description = req.getParameter("description");
        String image = req.getParameter("image");
        String trainer = req.getParameter("trainer");
        String movie = req.getParameter("movie");
        String[] categoriesSr = req.getParameterValues("categories");
        int[] categories = new int[categoriesSr.length];
        for (int i = 0; i < categoriesSr.length; i++) {
            categories[i] = Integer.parseInt(categoriesSr[i]);
        }
        MovieModel movieModel = new MovieModel(title, content, description, image, trainer, movie);
        movieService.insert(movieModel, categories);
        try {
            resp.sendRedirect(req.getContextPath() + "/MovieServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            case "edit":
                updateMovie(req, resp);
                break;
            default:
                showAll(req, resp);
                break;
        }
    }

    private void updateMovie(HttpServletRequest req, HttpServletResponse resp) {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String title = req.getParameter("title");
            String content = req.getParameter("content");
            String description = req.getParameter("description");
//        List<CategoryModel> categories = new ArrayList<>();
            String[] categoriesStr = req.getParameterValues("categories");
            List<CategoryModel> categoryModels = new ArrayList<>();
            for (String category_id_string : categoriesStr
            ) {
                categoryModels.add(new CategoryModel(Integer.parseInt(category_id_string)));
            }
            String image = req.getParameter("image");
            String trainer = req.getParameter("trainer");
            String movie = req.getParameter("movie");
            MovieModel movieModel = new MovieModel(id, title, content, description, categoryModels, image, trainer, movie);
            movieService.update(movieModel);
            resp.sendRedirect(req.getContextPath() + "/MovieServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        movieService.update();
//        title
//
//        description
//                categories
//        image
//                trainer
//        movie


    }
}
