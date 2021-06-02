package com.codegym.service;

import com.codegym.model.MovieModel;

import java.util.List;

public interface IMovieService {
    List<MovieModel> findAll();
    void save(MovieModel addMovie,int[] categories);
    MovieModel update(MovieModel updateProduct);
    void delete(String[] ids);
    MovieModel findOne(String id);
    MovieModel findOneByname(String name);

}
