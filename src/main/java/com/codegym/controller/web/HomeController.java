package com.codegym.controller.web;

import com.codegym.model.CategoryModel;
import com.codegym.model.MovieModel;
import com.codegym.service.CategoryService;
import com.codegym.service.IMovieService;
import com.codegym.service.impl.CategoryServiceImpl;
import com.codegym.service.impl.MovieService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "trangchu", urlPatterns = "/trangchu")
public class HomeController extends HttpServlet {
    private static IMovieService movieService = new MovieService();
    private static CategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action = "";
        }
        switch (action) {
            case "review":
                break;
            case "details":
                detailMovie(request, response);
                break;
            default:
                showAllMovieClient(request, response);
                break;
        }
    }

    private void detailMovie(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
//        MovieModel movieModel = movieService.selectUserByID(id);
//        List<CategoryModel> categoryModels = movieService.getCateByMovie(id);
//        List<CategoryModel> categoryModels1 = categoryModels.
//        request.setAttribute("listMovie", movieModel);
//        request.setAttribute("categories", categoryModels);
//        request.setAttribute("listMovie",movieModels);
        MovieModel movieModel = movieService.selectUserByID(id);
        List<CategoryModel> categoryModels = categoryService.findAll();
        List<CategoryModel> categoryModelsOfMovie = movieService.getCategoryByMovieId(id);
        request.setAttribute("movies", movieModel);
        request.setAttribute("categories", categoryModels);
        request.setAttribute("categoriesOfMovie", categoryModelsOfMovie);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminTeamplate/DetailsMovies.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAllMovieClient(HttpServletRequest request, HttpServletResponse response) {
        List<MovieModel> movieModels = movieService.selectAll();
        request.setAttribute("listMovie", movieModels);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "review":
                break;
            case "details":
                detailMovie(request, response);
                break;
            default:
                showAllMovieClient(request, response);
                break;
        }
    }
}
