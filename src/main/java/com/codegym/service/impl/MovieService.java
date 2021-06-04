package com.codegym.service.impl;

import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.CategoryModel;
import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovieService {
    private static final String SELECT_ALL_USER = "SELECT *FROM movies";
    private static final String INSERT_USER_SQL = "INSERT  into movies  (title,content,description,image_movie,youtubeTrainer,videoMovie) value (?,?,?,?,?,?)";
    private static final String INSERT_NEW_MOVIES_CATEGORY = "insert into categorymovie (id_category, move_id) VALUE (?, ?)";
    private static final String UPDATE_MOVIE_FROM_MOVIE ="UPDATE movies set title = ?,content =?,description=?,image_movie=?,youtubeTrainer=?,videoMovie=? where movie_id =?";
    private static final String INSERT_MOVIE_CATEGORY_FROM_CATEGORYMOVIE = "INSERT into  categorymovie(id_category,movie_id) value (?,?)";
    private static final String SELECT_MOVIE_ID ="SELECT  * FROM movies where move_id = ?" ;
    private static final String SELECT_CATEGORIES_BY_MOVIEID ="" ;
    private static final String DELETE_MOVIE_FROM_CATEGORYMOIVE = "DELETE FROM categorymovie where move_id = ?";
    private static final String DELETE_MOVIE_FROM_MOVIE ="DELETE FROM movies where move_id=?" ;

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
    public MovieModel selectUserByID(int id) {
        Connection connection = getConnection();
        MovieModel movieModel = null;
        try {
            PreparedStatement preparedStatement =  connection.prepareStatement(SELECT_MOVIE_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int movie_id = resultSet.getInt("move_id");
                String  title = resultSet.getString("title");
                String content = resultSet.getString("content");
                String description = resultSet.getString("description");
                String image_movie = resultSet.getString("image_movie");
                String trainer = resultSet.getString("youtubeTrainer");
                String video = resultSet.getString("videoMovie");
                movieModel = new MovieModel(movie_id,title,content,description,image_movie,trainer,video);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movieModel;
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

//            connection.setAutoCommit(false);
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
//                connection.commit(); ???
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
    public void delete(int id) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement =  connection.prepareStatement(DELETE_MOVIE_FROM_CATEGORYMOIVE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement1 = connection.prepareStatement(DELETE_MOVIE_FROM_MOVIE);
            preparedStatement1.setInt(1,id);
            preparedStatement1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(MovieModel movieModel) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_MOVIE_FROM_MOVIE);
            preparedStatement.setString(1,movieModel.getTitle());
            preparedStatement.setString(2,movieModel.getContent());
            preparedStatement.setString(3,movieModel.getDescription());
            preparedStatement.setString(4,movieModel.getImage_movie());
            preparedStatement.setString(5,movieModel.getYoutubeTrainer());
            preparedStatement.setString(6,movieModel.getVideoMovie());
            preparedStatement.executeUpdate();
            PreparedStatement preparedStatement2 = connection.prepareStatement(DELETE_MOVIE_FROM_CATEGORYMOIVE);
            preparedStatement2.setInt(1,movieModel.getMovie_id());
            preparedStatement2.executeUpdate();
            PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_MOVIE_CATEGORY_FROM_CATEGORYMOVIE);
            for (int i = 0; i <movieModel.getCategoryModels().size() ; i++) {
                preparedStatement1.setInt(1,movieModel.getMovie_id());
                preparedStatement1.setInt(2,movieModel.getCategoryModels().get(i).getCategory_id());
                preparedStatement1.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<CategoryModel> getCategoryByMovieId(int movieId) {
        List<CategoryModel> categoryModels = new ArrayList<>();
        Connection connection = getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORIES_BY_MOVIEID);
//    }
        return null;
    }
}
