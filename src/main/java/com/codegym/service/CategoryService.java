package com.codegym.service;

import com.codegym.dto.MoviesInfo;
import com.codegym.model.CategoryModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface CategoryService {

    List<CategoryModel> findAll();

    CategoryModel findById(HttpServletRequest request, HttpServletResponse response);

    List<MoviesInfo> findByIdCategory(HttpServletRequest request, HttpServletResponse response);

    boolean update(HttpServletRequest request);

    boolean delete(HttpServletRequest request);

    boolean save(HttpServletRequest request, HttpServletResponse response);

}
