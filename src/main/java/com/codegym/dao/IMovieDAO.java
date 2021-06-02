package com.codegym.dao;

import com.codegym.model.MovieModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IMovieDAO {
    List<MovieModel> findAll();

    MovieModel findOne(String id);

    List<MovieModel> findByCategoryId(String categoryId);

    String save(MovieModel addMovie);

    String setId(String name);

    void update(MovieModel updateMovie);

    void delete(String id);
//
//    List<ProductModel> findAll(Pageble pageble);
    int getTotalItem();
    MovieModel findOneByname(String name);
}
