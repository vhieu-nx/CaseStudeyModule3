package com.codegym.service;

import com.codegym.model.ReviewModel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IReviewService extends IGeneralDao<ReviewModel>{
    Optional<ReviewModel> findById(int reviewId);
    boolean save(ReviewModel review);
    List<ReviewModel> findAllByMovieId(int movieId);
}
