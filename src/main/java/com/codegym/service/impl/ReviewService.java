package com.codegym.service.impl;

import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.CategoryModel;
import com.codegym.model.ReviewModel;
import com.codegym.service.IReviewService;

import javax.xml.transform.Result;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReviewService implements IReviewService {
    private static final String REVIEWS_TABLE = "reviews";
    private static final String INSERT_REVIEW = "INSERT INTO " + REVIEWS_TABLE + " (user_id, movie_id, text)" +
            " VALUES (?, ?, ?);";
    private static final String UPDATE_REVIEW = "UPDATE" + REVIEWS_TABLE + "SET text = ? WHERE review_id=?";
    private static final String SELECT_ALL_REVIEW = "SELECT * from" + REVIEWS_TABLE;
    private static final String DELETE_REVIEW = "delete from " + REVIEWS_TABLE +"where review_id=?";
    private String SELECT_ReviewByID ="SELECT  * FROM" + REVIEWS_TABLE+" WHERE review_id =?";
    ;

    public static Connection getConnection() {
        return ConnectionJDBC.getConnection();
    }

    @Override
    public void insert(ReviewModel reviewModel, int[] categories) {

    }

    @Override
    public ReviewModel selectUserByID(int id) {
        Connection connection =getConnection();
        ReviewModel reviewModel = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ReviewByID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int review_id = resultSet.getInt("review_id");
                int user_id = resultSet.getInt("user_id");
                int movie_id = resultSet.getInt("move_id");
                String text = resultSet.getString("text");
                reviewModel = new ReviewModel(review_id,user_id,movie_id,text);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviewModel;
    }

    @Override
    public List<ReviewModel> selectUserByName(String inputSearch) {
        return null;
    }

    @Override
    public List<ReviewModel> selectAll() {
        List<ReviewModel> reviewModels = new ArrayList<>();
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_REVIEW);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int review_id = resultSet.getInt("review_id");
                int user_id = resultSet.getInt("user_id");
                int move_id = resultSet.getInt("move_id");
                String text = resultSet.getString("text");
                reviewModels.add(new ReviewModel(review_id,user_id,move_id,text));
                connection.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Connection connection =getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement= connection.prepareStatement(DELETE_REVIEW);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(ReviewModel reviewModel) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_REVIEW);
            preparedStatement.setString(1, reviewModel.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<CategoryModel> getCategoryByMovieId(int movieId) {
        return null;
    }

    @Override
    public List<ReviewModel> selectAllByMoveId(int id) {
        return null;
    }

    @Override
    public List<CategoryModel> getCateByMovie(int movieId) {
        return null;
    }

    @Override
    public Optional<ReviewModel> findById(int reviewId) {
        return Optional.empty();
    }

    @Override
    public boolean save(ReviewModel review) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REVIEW);
            preparedStatement.setInt(1, review.getUserId());
            preparedStatement.setInt(2, review.getMovieId());
            preparedStatement.setString(3, review.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<ReviewModel> findAllByMovieId(int movieId) {

        return null;
    }
}
