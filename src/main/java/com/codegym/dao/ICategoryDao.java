package com.codegym.dao;

import com.codegym.model.CategoryModel;

import java.sql.SQLException;
import java.util.List;

public interface ICategoryDao {
    List<CategoryModel> showAll();
    void update(int categoryId,CategoryModel categoryModel) throws SQLException;
    void delete(int categoryId) throws SQLException;
    void save(CategoryModel categoryModel) throws SQLException;
}
