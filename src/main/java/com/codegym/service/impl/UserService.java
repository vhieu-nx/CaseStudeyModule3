package com.codegym.service.impl;


import com.codegym.dao.impl.UserDAO;
import com.codegym.model.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;

public class UserService {
    UserDAO userDAO = new UserDAO();
//    Form them moi user
    public void createFormUser(HttpServletRequest request, HttpServletResponse response){
        String jsp = "wedmovie/createuser.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



//    Them moi User
    public void createUser(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserModel userModel = new UserModel(name,email,password);
        userDAO.save(userModel);
    }

    public void updateFormB1User(HttpServletRequest request, HttpServletResponse response){
        String jsp = "wedmovie/update/update1.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateFormB2User(HttpServletRequest request, HttpServletResponse response){
        String jsp = "wedmovie/update/update2.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateB1User(HttpServletRequest request, HttpServletResponse response){
        String email;
        UserModel userModel = new UserModel();
        try {
            email = request.getParameter("email");
            userModel = userDAO.findByEmail(email);
            if (userModel== null){
                throw new Error();
//                Chưa đúng lắm .......
//                ................................
            }
        }catch (Error e){
            request.setAttribute("status","Email Không có trên hệ thống");
//            Hiển thị ra đâu?????
//            ...........................
        }

            request.setAttribute("userModel",userModel);
        try {
            response.sendRedirect("/UserServlet?action=update1");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void updateB2User(HttpServletRequest request, HttpServletResponse response){
        String email = request.getParameter("email");
        UserModel userModel = userDAO.findByEmail(email);
        if (userModel!= null){
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            UserModel userModel1 = new UserModel(name,email,password);
            userDAO.updateUser(email,userModel1);
        }else {
//            làm sau
//            ......
//            .......

        }



    }

}
