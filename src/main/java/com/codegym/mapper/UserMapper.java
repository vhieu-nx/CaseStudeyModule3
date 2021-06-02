package com.codegym.mapper;

import com.codegym.model.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserModel>{
    UserModel userModel = new UserModel();
    @Override
    public UserModel mapRow(ResultSet rs) {
        try {
            userModel.setName(rs.getString("username"));
            userModel.setEmail(rs.getString("email"));
            userModel.setPassword(rs.getString("password"));
            userModel.setRole(rs.getString("role"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userModel;
    }
}
