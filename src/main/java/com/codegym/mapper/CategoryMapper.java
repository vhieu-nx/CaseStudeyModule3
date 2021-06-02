package com.codegym.mapper;

import com.codegym.model.CategoryModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoryMapper implements RowMapper {
    private CategoryModel categoryModel = new CategoryModel();
    @Override
    public Object mapRow(ResultSet rs) {
        try {
            categoryModel.setName(rs.getString("name"));
            categoryModel.setMoviemodel((List) rs.getObject("movieModel"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categoryModel;
    }
}
