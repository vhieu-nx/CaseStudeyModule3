package com.codegym.controller.web;

import com.codegym.dao.ICategoryDao;
import com.codegym.dao.impl.CategoryDAO;
import com.codegym.dto.MoviesInfo;
import com.codegym.model.MovieModel;
import com.codegym.service.CategoryService;
import com.codegym.service.IMovieService;
import com.codegym.service.impl.CategoryServiceImpl;
import com.codegym.service.impl.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", value = "/movies/search")
public class CommonController extends HttpServlet {
    ICategoryDao categoryDao = new CategoryDAO();
    IMovieService movieService = new MovieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("value");
        switch (name){
            case "movies":
                searchMovies(req, resp);
                break;
            case "category":
                searchCategory(req, resp);
                break;
        }

    }

    private void searchCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        List<MovieModel> list = categoryDao.findNameCategory(name);
        req.setAttribute("name",name);
        req.setAttribute("list",list);
        req.getRequestDispatcher("/show-movies.jsp").forward(req, resp);
    }

    private void searchMovies(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        List<MovieModel> list = movieService.selectUserByName(name);
        req.setAttribute("list", list);
        req.getRequestDispatcher("/show-movies.jsp").forward(req, resp);
    }
}
