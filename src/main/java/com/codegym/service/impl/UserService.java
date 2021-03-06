package com.codegym.service.impl;


import com.codegym.dao.impl.UserDAO;
import com.codegym.model.UserModel;
import com.codegym.service.IUserService;
import com.codegym.utils.SessionUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class UserService implements IUserService {

    UserDAO userDAO = new UserDAO();


    @Override
    public void showAllUserClient(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "AdminTeamplate/showuserlist.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        List<UserModel> userModels = userDAO.showAll();
        request.setAttribute("user", userModels);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createFormUser(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "AdminTeamplate/login.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request, response);
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
        UserModel userModel = new UserModel(name, email, password);
        userDAO.save(userModel);
        enterHome(request,response);

    }

    @Override
    public void updateFormB1User(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "AdminTeamplate/updatelogin.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateB1User(HttpServletRequest request, HttpServletResponse response) {
        String email = null;
        UserModel userModel = new UserModel();
        try {
            email = request.getParameter("email");
            userModel = userDAO.findByEmail(email);
            if (userModel == null) {
                throw new Error();
//                Ch??a ????ng l???m .......
//                ................................
            }
        } catch (Error e) {
//            request.setAttribute("status", "Email Kh??ng c?? tr??n h??? th???ng");
//            Hi???n th??? ra ????u?????
//            ...........................
        }
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserModel userModel1 = new UserModel(name, email, password);
        userDAO.updateUser(email, userModel1);
        enterHome(request,response);

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
        String jsp = "/index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Nhap vao tai khoan de dang nhap
    @Override
    public void enterlogin(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("name");
        String password = request.getParameter("password");
        UserModel userModel = userDAO.findUserName(email, password);
        if (userModel != null) {
            if (userModel.getRole().equalsIgnoreCase("CLIENT")) {
                try {
                    HttpSession session = request.getSession();

                    session.setAttribute("userModel", userModel);
                   response.sendRedirect(request.getContextPath() + "/trangchu");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (userModel.getRole().equalsIgnoreCase("ADMIN")) {
                String name = userModel.getName();
                try {
                    HttpSession session = request.getSession();
                    response.sendRedirect(request.getContextPath() + "/admin-home");
                    session.setAttribute("userModel", name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            String jsp = "/index.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void enterHome(HttpServletRequest request, HttpServletResponse response) {
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
    public void logOut(HttpServletRequest request, HttpServletResponse response) {
        SessionUtils.getInstance().removeValue(request, "userModel");
        try {
            response.sendRedirect(request.getContextPath() + "/Login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void changePassword(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        UserModel userModel = userDAO.findUserByEmailandName(name,email);
        if (userModel!=null){
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("password1");
            if (password.equals(confirmPassword)){
                UserModel userModel1 = new UserModel(name,email,password);
                userDAO.updateUser(email,userModel1);
                enterHome(request,response);
            }
        }
    }

    @Override
    public void formChangePassword(HttpServletRequest request, HttpServletResponse response) {
        String jsp = "AdminTeamplate/updatepassword.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
