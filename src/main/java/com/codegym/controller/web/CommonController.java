package com.codegym.controller.web;

import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;
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

    IMovieService movieService = new MovieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        List<MovieModel> list = movieService.selectUserByName(name);
        req.setAttribute("listMovie", list);
        req.getRequestDispatcher("/show-movies.jsp").forward(req, resp);
    }
}
