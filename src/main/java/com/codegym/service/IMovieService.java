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
    MovieModel findOneByname(String name);

////=======
//public interface IMovieService extends IGeneralDao<MovieModel> {
////>>>>>>> a353a8de8711ac9b2356acbc96d1326e9d2bdb39
}
