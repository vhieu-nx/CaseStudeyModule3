package com.codegym.mapper;

import com.codegym.model.MovieModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<MovieModel> {
    @Override
    public MovieModel mapRow(ResultSet rs) {
MovieModel movieModel = new MovieModel();
        try {
            movieModel.setMovie_id(rs.getInt("move_id"));
            movieModel.setTitle(rs.getString("title"));
            movieModel.setContent(rs.getString("content"));
            movieModel.setDescription(rs.getString("description"));
            movieModel.setImage_movie(rs.getString("image_movie"));
            movieModel.setYoutubeTrainer(rs.getString("youtubeTrainer"));
            movieModel.setVideoMovie(rs.getString("videoMovie"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
