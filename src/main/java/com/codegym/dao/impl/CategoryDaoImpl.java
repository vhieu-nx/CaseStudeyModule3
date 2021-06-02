package com.codegym.dao.impl;

import com.codegym.dao.CategoryDao;
import com.codegym.model.CategoryModel;

import java.util.List;

public class CategoryDaoImpl extends AbtractDAO implements CategoryDao {

    @Override
    public void insert(CategoryModel categoryModel) {
//        String sql = "insert into category(name,moviemodel) value( ? )";
    }

    @Override
    public void update(CategoryModel categoryModel) {

    }

    @Override
    public void delete(Long categoryId) {

    }

    @Override
    public List<CategoryModel> showAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public CategoryModel getById(Long id) {
        return null;
    }
}
