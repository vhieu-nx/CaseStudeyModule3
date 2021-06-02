package com.codegym.dao.impl;

import com.codegym.dao.IUserDAO;
import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements IUserDAO {
    Connection connection = ConnectionJDBC.getConnection();
    @Override
    public List<UserModel> showAll() {
        return null;
    }

    @Override
    public void save(UserModel userModel) {
        String sql = "insert into user(username, email, password, role) value ('?','?','?','?')";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userModel.getName());
            preparedStatement.setString(2,userModel.getEmail());
            preparedStatement.setString(3,userModel.getPassword());
            preparedStatement.setString(4,userModel.getRole());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(int id, UserModel userModel) {
        String sql = "update user set username = ?,email = ?,password = ?,role = ? where user_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userModel.getName());
            preparedStatement.setString(2,userModel.getEmail());
            preparedStatement.setString(3,userModel.getPassword());
            preparedStatement.setString(4,userModel.getRole());
            preparedStatement.setInt(5,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where user_id= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public UserModel findById(int id) {
        return null;
    }

    @Override
    public List<UserModel> findListById(int id) {
        return null;
    }

    @Override
    public UserModel findByName(String name) {
        return null;
    }
}