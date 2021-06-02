package com.codegym.dao.impl;

import com.codegym.dao.GenericDAO;
import com.codegym.mapper.RowMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class AbtractDAO<T> implements GenericDAO<T> {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
    public Connection getConnection() {
        try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306/jspservletjdbc";
//			String username = "root";
//			String password = "123456";
            Class.forName(resourceBundle.getString("driverName"));
            String url = resourceBundle.getString("url");
            String user = resourceBundle.getString("user");
            String password = resourceBundle.getString("password");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        return null;
    }

    @Override
    public void update(String sql, Object... parameters) {

    }

    @Override
    public Long insert(String sql, Object... parameters) {
        return null;
    }

    @Override
    public int count(String sql, Object... parameters) {
        return 0;
    }
}
