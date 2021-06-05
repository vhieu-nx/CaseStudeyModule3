package com.codegym.controller.admin;

import com.codegym.service.IUserService;
import com.codegym.service.impl.UserService;
import com.codegym.utils.SessionUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/Login")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "login":
                userService.login(request,response);
                break;
            case "logout":

                SessionUtils.getInstance().removeValue(request,"userModel");
                response.sendRedirect(request.getContextPath()+ "/Login");
                break;
            case "create":
                userService.createFormUser(request,response);
                break;
            case "update":
                userService.updateFormB1User(request,response);
                break;
            case "update1":
                userService.updateFormB2User(request,response);
                break;
            case "remove":
                break;
            default:
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("wedmovie/user.jsp");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request,response);
                break;
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "login":
                userService.enterlogin(request,response);
                break;
            case "create":
                userService.createUser(request,response);
                break;
            case "update":
                userService.updateB1User(request,response);
                break;
            case "update1":
                userService.updateB2User(request,response);
                break;
            case "remove":
                break;
            default:
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("wedmovie/user.jsp");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request,response);
                break;
        }
    }
}
