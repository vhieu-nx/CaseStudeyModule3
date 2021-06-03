package com.codegym.controller.admin;

import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;
import com.codegym.service.impl.MovieService;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/admin-home")
public class HomeServlet extends HttpServlet {
    private static IMovieService movieService = new MovieService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            action = "";
        }
        switch (action) {
            case "create":
//                addNewMovie(request, response);
//                break;
            default:
                showAll(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
}
