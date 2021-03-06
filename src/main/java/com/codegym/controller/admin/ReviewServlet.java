package com.codegym.controller.admin;

import com.codegym.model.MovieModel;
import com.codegym.model.ReviewModel;
import com.codegym.service.IMovieService;
import com.codegym.service.IReviewService;
import com.codegym.service.impl.MovieService;
import com.codegym.service.impl.ReviewService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ReviewServlet", value = "/ReviewServlet")
public class ReviewServlet extends HttpServlet {
    private static IReviewService review = new ReviewService();
//    private static IMovieService movieService = new MovieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "delete":
                deleteReview(req,resp);
                break;
            default:
                showAllReview(req,resp);
                break;
        }

    }

    private void deleteReview(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        review.delete(id);
        try {
            resp.sendRedirect(req.getContextPath() + "/ReviewServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showAllReview(HttpServletRequest req, HttpServletResponse resp) {
        List<ReviewModel> reviewModels = review.selectAll();
        req.setAttribute("review", reviewModels);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/itemsListReview.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addReview(HttpServletRequest req, HttpServletResponse resp) {
        String text = req.getParameter("textAreaValue");
        int userid = Integer.parseInt(req.getParameter("userId"));
        int movieId = Integer.parseInt(req.getParameter("movieId"));
        ReviewModel reviewModel = new ReviewModel(userid,movieId,text);
        review.save(reviewModel);
        req.setAttribute("reviewmodel",reviewModel);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminTeamplate/DetailsMovies.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action ==null){
            action="";
        }switch (action){

            default:
                showAllReview(req,resp);
                break;
        }
    }
}
