package com.codegym.dao;

import com.codegym.model.MovieModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IMovieDAO {
    List<MovieModel> findAll() ;

    List<MovieModel> findAllByCriteria(Map<String, String> criteria) ;

    Optional<MovieModel> findById(int movieId) ;

    boolean update(MovieModel movie);

    boolean save(MovieModel movie) ;

    boolean delete(int movieId);
}
