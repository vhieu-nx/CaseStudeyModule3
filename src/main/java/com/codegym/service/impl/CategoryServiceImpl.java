package com.codegym.service.impl;

import com.codegym.dao.ICategoryDao;
import com.codegym.dao.impl.CategoryDAO;
import com.codegym.model.CategoryModel;
import com.codegym.service.CategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private ICategoryDao categoryDao;

    public CategoryServiceImpl(){
        this.categoryDao = new CategoryDAO();
    }

    @Override
    public List<CategoryModel> showAll() {
        return categoryDao.showAll();
    }

    @Override
    public boolean update(HttpServletRequest request) {
        try{
            int id = Integer.parseInt(request.getParameter("category_id"));
            String categoryName = request.getParameter("category_name");
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setCategory_id(id);
            categoryModel.setName(categoryName);
            categoryDao.update(id, categoryModel);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(HttpServletRequest request) {
       int id = Integer.parseInt(request.getParameter("category_id"));
        try {
            categoryDao.delete(id);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean save(HttpServletRequest request, HttpServletResponse response) {
        String categoryName = request.getParameter("name");
        CategoryModel categoryModel = new CategoryModel(categoryName);
        try {
            categoryDao.save(categoryModel);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
