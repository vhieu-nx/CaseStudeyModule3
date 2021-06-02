package com.codegym.service.impl;

import com.codegym.model.MovieModel;
import com.codegym.service.IMovieService;

import java.sql.Connection;
import java.util.List;

public class MovieService implements IMovieService {
    public static Connection getConnection() {
        return null;
    }

    @Override
    public List<MovieModel> findAll() {
        return null;
//>>>>>>>114 cfe3806c40fd37bbc156d4a049d7d6abbb037
    }

    @Override
    public MovieModel save(MovieModel addMovie) {
        return null;
    }

    @Override
    public String setId(String name) {
        return null;
    }

    @Override
    public MovieModel update(MovieModel updateProduct) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public int getTotalItem() {
        return 0;
    }

    @Override
    public MovieModel findOne(String id) {
        return null;
    }

    @Override
    public MovieModel findOneByname(String name) {
        return null;
    }
}