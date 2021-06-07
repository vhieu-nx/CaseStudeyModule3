package com.codegym.service;

import com.codegym.model.MovieModel;
import com.codegym.paging.Pageble;

import java.util.List;

public interface IMovieService extends IGeneralDao<MovieModel> {
List<MovieModel> findAllPaging(Pageble pageble);
}
