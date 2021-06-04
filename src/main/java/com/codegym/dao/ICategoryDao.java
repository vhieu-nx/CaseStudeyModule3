package com.codegym.dao;

import com.codegym.model.CategoryModel;

import java.sql.SQLException;
import java.util.List;

public interface ICategoryDao {
    List<CategoryModel> findAll();
    CategoryModel findById(int id);
    void update(int categoryId,CategoryModel categoryModel);
    void delete(int categoryId) throws SQLException;
    void save(CategoryModel categoryModel) throws SQLException;

}
