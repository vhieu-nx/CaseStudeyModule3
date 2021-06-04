package com.codegym.dao.impl;

import com.codegym.dao.IUserDAO;
import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    Connection connection = ConnectionJDBC.getConnection();
    @Override
    public List<UserModel> showAll() {
        List<UserModel> list = new ArrayList<>();
        String sql = "select * from user where role = 'CLIENT'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                UserModel userModel= new UserModel(name,email, password);
                list.add(userModel);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    @Override
    public void save(UserModel userModel) {
        String sql = "insert into user(username, email, password, role) value (?,?,?,?)";
//        String sql1 = "insert into user(username, email, password, role) value ('sang','sang@gmail.com','123456789','CLIENT');"
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userModel.getName());
            preparedStatement.setString(2,userModel.getEmail());
            preparedStatement.setString(3,userModel.getPassword());
            preparedStatement.setString(4,"CLIENT");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(int id, UserModel userModel) {
    }


    @Override
    public void updateUser(String email, UserModel userModel) {
        String sql = "update user set username = ?,email = ?,password = ?,role = ? where email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userModel.getName());
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,userModel.getPassword());
            preparedStatement.setString(4,"CLIENT");
            preparedStatement.setString(5,email);
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
        UserModel userModel = null;
        String sql ="select * from user where user_id= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet set = preparedStatement.executeQuery();
            while (set.next()){
                String name = set.getString("name");
                String email = set.getString("email");
                String password = set.getString("password");
                String role = set.getString("role");
                userModel = new UserModel(name,email,password,role);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userModel;
    }

    @Override
    public List<UserModel> findListById(int id) {
        return null;
    }


    @Override
    public UserModel findByName(String name) {
        return null;
    }

    @Override
    public UserModel findUserName(String email,String password) {
        UserModel userModel = null;
        String sql = "select * from user where email = ? && password =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("username");
                String role = resultSet.getString("role");
                userModel = new UserModel(name,email,password,role);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userModel;
    }

    @Override
    public UserModel findByEmail(String email) {
        UserModel userModel = null;
        String sql = "select * from user where email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("username");
                String password = resultSet.getString("username");
                String role = resultSet.getString("role");
                userModel = new UserModel(name,email,password,role);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userModel;
    }

}
