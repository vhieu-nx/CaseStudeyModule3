package com.codegym.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IUserService {
    public void showAllUserClient(HttpServletRequest request, HttpServletResponse response);
    public void createFormUser(HttpServletRequest request, HttpServletResponse response);
    public void createUser(HttpServletRequest request, HttpServletResponse response);
    public void updateFormB1User(HttpServletRequest request, HttpServletResponse response);
    public void updateFormB2User(HttpServletRequest request, HttpServletResponse response);
    public void updateB1User(HttpServletRequest request, HttpServletResponse response);
    public void updateB2User(HttpServletRequest request, HttpServletResponse response);
    public void removeUser(HttpServletRequest request, HttpServletResponse response);
    public void login(HttpServletRequest request, HttpServletResponse response);
    public void enterlogin(HttpServletRequest request, HttpServletResponse response);
    public void enterHome(HttpServletRequest request, HttpServletResponse response);
    public void logOut(HttpServletRequest request, HttpServletResponse response);


    }
