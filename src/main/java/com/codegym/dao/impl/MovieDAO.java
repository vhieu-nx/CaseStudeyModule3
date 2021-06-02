package com.codegym.dao.impl;

import com.codegym.dao.IMovieDAO;
import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.MovieModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MovieDAO implements IMovieDAO {
    public  static Connection getConnection(){
        return ConnectionJDBC.getConnection();
    }
    @Override
    public List<MovieModel> findAll() {
        return null;
    }

    @Override
    public List<MovieModel> findAllByCriteria(Map<String, String> criteria) {
        List<MovieModel> movies = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM ")
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Optional<MovieModel> findById(int movieId) {
        return Optional.empty();
    }

    @Override
    public boolean update(MovieModel movie) {
        return false;
    }

    @Override
    public boolean save(MovieModel movie) {
        return false;
    }

    @Override
    public boolean delete(int movieId) {
        return false;
    }
}
