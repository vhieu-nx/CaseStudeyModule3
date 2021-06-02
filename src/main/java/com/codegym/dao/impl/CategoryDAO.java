package com.codegym.dao.impl;

import com.codegym.dao.ICategoryDao;
import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.CategoryModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDao {

    @Override
    public List<CategoryModel> showAll() {
        List<CategoryModel> list = new ArrayList<>();
        String sql = "select * from category";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionJDBC.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) ;
            int id = resultSet.getInt("category_id");
            String name = resultSet.getString("name");
            CategoryModel categoryModel = new CategoryModel(id, name);
            list.add(categoryModel);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void update(int categoryId, CategoryModel categoryModel) throws SQLException {
        String sql = "update category set category_name = ? where id_category = ?";
        Connection connection = ConnectionJDBC.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, categoryModel.getName());
        preparedStatement.setInt(2, categoryModel.getCategory_id());
        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(int categoryId) throws SQLException {
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "delete from category where id_category = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, categoryId);
        preparedStatement.executeUpdate();


    }

    @Override
    public void save(CategoryModel categoryModel) throws SQLException {
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "insert into category (name) value (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,categoryModel.getName());
        preparedStatement.executeUpdate();
    }
}
