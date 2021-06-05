package com.codegym.service.impl;


import com.codegym.dao.impl.UserDAO;
import com.codegym.model.UserModel;
import com.codegym.service.IUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class UserService implements IUserService {

    UserDAO userDAO = new UserDAO();


    @Override
    public void showAllUserClient(HttpServletRequest request, HttpServletResponse response) {
        String jsp ="wedmovie/adminuser/listuserclient.jsp";
        RequestDispatcher requestDispatcher= request.getRequestDispatcher(jsp);
        List<UserModel> userModels = userDAO.showAll();
        request.setAttribute("user",userModels);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createFormUser(HttpServletRequest request, HttpServletResponse response) {
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

    @Override
    public void createUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserModel userModel = new UserModel(name,email,password);
        userDAO.save(userModel);
    }

    @Override
    public void updateFormB1User(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "wedmovie/updateuser/update1.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateFormB2User(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "wedmovie/updateuser/update2.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateB1User(HttpServletRequest request, HttpServletResponse response) {
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

    @Override
    public void updateB2User(HttpServletRequest request, HttpServletResponse response) {
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
//Xoa tai khoan khach
    @Override
    public void removeUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        userDAO.delete(id);
        try {
            response.sendRedirect("/AdminServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//vao trang dang nhap
    @Override
    public void login(HttpServletRequest request, HttpServletResponse response) {
        String jsp  = "index-2.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//Nhap vao tai khoan de dang nhap
    @Override
    public void enterlogin(HttpServletRequest request, HttpServletResponse response){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserModel userModel = userDAO.findUserName(email,password);
        String name = userModel.getName();
        if (userModel!=null){
            if (userModel.getRole().equalsIgnoreCase("CLIENT")){
                try {
                    HttpSession session = request.getSession();
                    String jsp = "/index.jsp";
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
                    session.setAttribute("userModel",name);
                    requestDispatcher.forward(request,response);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ServletException e) {
                    e.printStackTrace();
                }
            }else
            if(userModel.getRole().equalsIgnoreCase("ADMIN")){
                try {
                    HttpSession session = request.getSession();
                    response.sendRedirect(request.getContextPath()+"/indexAdmin.jsp");
                    session.setAttribute("userModel",name);
//                    requestDispatcher.forward(request,response);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }else {

<<<<<<< HEAD
           String jsp= "/UserServlet?action=login";
=======
//            người dùng không truyền dữ liệu ấn submit thì sẽ thông báo nhập dữ liệu.
//            không thực hiện đúng ý
           String jsp= "/Login?action=login";
>>>>>>> f2122db88a0c38dffad22ab285ce7cea7bb4dd49
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
            String s = "mời bạn đăng nhập";
            request.setAttribute("s" ,s);
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }



}
