package com.codegym.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IUserService {
    public void showAllUserClient(HttpServletRequest request, HttpServletResponse response);
    public void createFormUser(HttpServletRequest request, HttpServletResponse response);
    public void createUser(HttpServletRequest request, HttpServletResponse response);
    public void updateFormB1User(HttpServletRequest request, HttpServletResponse response);
    public void updateFormB2User(HttpServletRequest request, HttpServletResponse response);
    public void updateB1User(HttpServletRequest request, HttpServletResponse response);
    public void updateB2User(HttpServletRequest request, HttpServletResponse response);


    }
