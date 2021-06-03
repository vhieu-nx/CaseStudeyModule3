package com.codegym.service.impl;

import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovieService {
    private static final String SELECT_ALL_USER = "SELECT *FROM movies";
    private static final String INSERT_USER_SQL = "Select move_id,title,content,description,image_movie,youtubeTrainer,videoMovie value (?,?,?,?,?,?)";
    private static final String INSERT_NEW_MOVIES_CATEGORY = "insert into categorymovie (id_category, move_id) VALUE (?, ?)";

    public static Connection getConnection(){
        return ConnectionJDBC.getConnection();
    }

    @Override
    public void insert(MovieModel movieModel,int[] categories) {
        int movie_id = 0;
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, movieModel.getTitle());
            preparedStatement.setString(2, movieModel.getContent());
            preparedStatement.setString(3, movieModel.getDescription());
            preparedStatement.setString(4, movieModel.getImage_movie());
            preparedStatement.setString(5, movieModel.getYoutubeTrainer());
            preparedStatement.setString(6, movieModel.getVideoMovie());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            while (resultSet.next()){
                movie_id = resultSet.getInt(1);
            }
            PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_NEW_MOVIES_CATEGORY);
            for (int id_category : categories){
                preparedStatement1.setInt(1,id_category);
                preparedStatement1.setInt(2,movie_id);
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (SQLException throwables) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }
    }

    @Override
    public MovieModel selectUserByID(String id) {
        return null;
    }

    @Override
    public List<MovieModel> selectUserByName(String inputSearch) {
        return null;
    }

    @Override
    public List<MovieModel> selectAll() {
        List<MovieModel> movies = new ArrayList<>();
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int  moveid = rs.getInt("move_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String description = rs.getString("description");
                String image = rs.getString("image_movie");
                String ytbTrainer = rs.getString("youtubeTrainer");
                String video = rs.getString("videoMovie");
                movies.add(new MovieModel(moveid, title, content, description,image,ytbTrainer,video));
                connection.commit();

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return movies;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(MovieModel movieModel) {

    }
}
