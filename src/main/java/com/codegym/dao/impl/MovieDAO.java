package com.codegym.dao.impl;

import com.codegym.dao.IMovieDAO;
import com.codegym.mapper.MovieMapper;
import com.codegym.model.MovieModel;

import java.util.List;

public class MovieDAO extends AbtractDAO<MovieModel> implements IMovieDAO {
    @Override
    public List<MovieModel> findAll() {
        String sql = "SELECT *FROM movies";
        return  query(sql,new MovieMapper());
    }

    @Override
    public MovieModel findOne(String id) {
        String sql = "SELECT *FROM movies WHERE move_id =?";
        List<MovieModel> movieModels = query(sql,new MovieMapper(),id);
        return movieModels.isEmpty() ? null : movieModels.get(0);
    }

    @Override
    public List<MovieModel> findByCategoryId(String categoryId) {
        return null;
    }

    @Override
    public String save(MovieModel addMovie) {
        return null;
    }

    @Override
    public String setId(String name) {
        return null;
    }

    @Override
    public void update(MovieModel updateMovie) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int getTotalItem() {
        return 0;
    }

    @Override
    public MovieModel findOneByname(String name) {
        return null;
    }
}
