package com.codegym.dao;

import com.codegym.dto.MoviesInfo;
import com.codegym.model.CategoryModel;

import java.sql.SQLException;
import java.util.List;

public interface ICategoryDao {
    List<CategoryModel> findAll();
    CategoryModel findById(int id);
    List<MoviesInfo> findByIdCategory(int categoryId, String name);
    void update(int categoryId,CategoryModel categoryModel);
    void delete(int categoryId) throws SQLException;
    void save(CategoryModel categoryModel) throws SQLException;

}
