package com.codegym.controller.admin;

import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/HomeServlet")
public class HomeServlet extends HttpServlet {
@Inject
private IMovieService movieService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MovieModel movieModel = new MovieModel();
        movieModel.setListResult(movieService.findAll());
        request.setAttribute("movies",movieModel);
         RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
         requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
