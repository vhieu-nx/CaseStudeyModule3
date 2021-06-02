package com.codegym.service;

import com.codegym.model.MovieModel;

import java.util.List;

public interface IMovieService {
    List<MovieModel> findAll();
    MovieModel save(MovieModel addMovie);

    String setId(String name);
    MovieModel update(MovieModel updateProduct);
    void delete(String[] ids);
//    List<MovieModel> findAll(Pageble pageble);
    int getTotalItem();
    MovieModel findOne(String id);
//<<<<<<< HEAD
//
//=======
//>>>>>>> 114cfe3806c40fd37bbc156d4a049d7d6abbb037
    MovieModel findOneByname(String name);

}
