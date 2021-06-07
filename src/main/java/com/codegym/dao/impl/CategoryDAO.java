package com.codegym.dao.impl;

import com.codegym.dto.MoviesInfo;
import com.codegym.dao.ICategoryDao;
import com.codegym.dao.connection.ConnectionJDBC;
import com.codegym.model.CategoryModel;
import com.codegym.model.MovieModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDao {

    @Override
    public List<CategoryModel> findAll() {
        List<CategoryModel> list = new ArrayList<>();
        String sql = "select * from category";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = ConnectionJDBC.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_category");
                String name = resultSet.getString("category_name");
                CategoryModel categoryModel = new CategoryModel(id, name);
                list.add(categoryModel);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public CategoryModel findById(int id_category) {
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "select * from category where id_category = ? ";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_category);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setCategory_id(resultSet.getInt("id_category"));
            categoryModel.setName(resultSet.getString("category_name"));
            return categoryModel;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MoviesInfo> findByIdCategory(int categoryId, String name) {
        List<MoviesInfo> list= new ArrayList<>();
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "select m.title,m.content,m.image_movie,c.category_name" +
                " from category c inner join categorymovie cam" +
                " on c.id_category = cam.id_category " +
                "inner join movies m on cam.move_id = m.move_id where c.id_category = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, categoryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
            MoviesInfo moviesInfo= new MoviesInfo();
            moviesInfo.setTitle(resultSet.getString("title"));
            moviesInfo.setImg_movie(resultSet.getString("image_movie"));
            moviesInfo.setCategory_name(resultSet.getString("category_name"));
            list.add(moviesInfo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public List<MovieModel> findNameCategory(String name) {
        List<MovieModel> list= new ArrayList<>();
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "select m.*,c.category_name" +
                " from category c inner join categorymovie cam" +
                " on c.id_category = cam.id_category " +
                "inner join movies m on cam.move_id = m.move_id where c.category_name like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
//                MoviesInfo moviesInfo= new MoviesInfo();
//                moviesInfo.setTitle(resultSet.getString("title"));
//                moviesInfo.setImg_movie(resultSet.getString("image_movie"));
//                moviesInfo.setYoutubeTrainer(resultSet.getString("youtubeTrainer"));
//                moviesInfo.setYoutubeTrainer(resultSet.getString("videoMovie"));
//                moviesInfo.setCategory_name(resultSet.getString("category_name"));
//                list.add(moviesInfo);
                String nameMovies = resultSet.getString("title");
                String imageMovies = resultSet.getString("image_movie");
                String youtubeTrainer = resultSet.getString("youtubeTrainer");
                String videoMovie = resultSet.getString("videoMovie");
                MovieModel movieModel = new MovieModel(nameMovies,imageMovies,youtubeTrainer,videoMovie);
                list.add(movieModel);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(int categoryId, CategoryModel categoryModel) {
        String sql = "update category set category_name = ? where id_category = ?";
        Connection connection = ConnectionJDBC.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, categoryModel.getName());
            preparedStatement.setInt(2, categoryModel.getCategory_id());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int categoryId) throws SQLException {
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "delete from category where id_category = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, categoryId);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void save(CategoryModel categoryModel) throws SQLException {
        Connection connection = ConnectionJDBC.getConnection();
        String sql = "insert into category (category_name) value (?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, categoryModel.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
