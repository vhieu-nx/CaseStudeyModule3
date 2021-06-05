package com.codegym.model;

import java.util.List;

public class MovieModel {
    private int movie_id;
    private String title;
    private String content;
    private String description;
    List<CategoryModel> categoryModels;
    private String image_movie;
    private String youtubeTrainer;
    private String videoMovie;

    public MovieModel() {
    }

    public MovieModel(int movie_id, String title, String content, String description, List<CategoryModel> categoryModels, String image_movie, String youtubeTrainer, String videoMovie) {
        this.movie_id = movie_id;
        this.title = title;
        this.content = content;
        this.description = description;
        this.categoryModels = categoryModels;
        this.image_movie = image_movie;
        this.youtubeTrainer = youtubeTrainer;
        this.videoMovie = videoMovie;
    }

    public List<CategoryModel> getCategoryModels() {
        return categoryModels;
    }

    public void setCategoryModels(List<CategoryModel> categoryModels) {
        this.categoryModels = categoryModels;
    }

    public MovieModel(int movie_id, String title, String content, String description, String image_movie, String youtubeTrainer, String videoMovie) {
        this.movie_id = movie_id;
        this.title = title;
        this.content = content;
        this.description = description;
        this.image_movie = image_movie;
        this.youtubeTrainer = youtubeTrainer;
        this.videoMovie = videoMovie;
    }

    public MovieModel(String title, String content, String description, String image_movie, String youtubeTrainer, String videoMovie) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.image_movie = image_movie;
        this.youtubeTrainer = youtubeTrainer;
        this.videoMovie = videoMovie;
    }

    public MovieModel(String title, String content, String description, List<CategoryModel> categoryModels, String image_movie, String youtubeTrainer, String videoMovie) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.categoryModels = categoryModels;
        this.image_movie = image_movie;
        this.youtubeTrainer = youtubeTrainer;
        this.videoMovie = videoMovie;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_movie() {
        return image_movie;
    }

    public void setImage_movie(String image_movie) {
        this.image_movie = image_movie;
    }

    public String getYoutubeTrainer() {
        return youtubeTrainer;
    }

    public void setYoutubeTrainer(String youtubeTrainer) {
        this.youtubeTrainer = youtubeTrainer;
    }

    public String getVideoMovie() {
        return videoMovie;
    }

    public void setVideoMovie(String videoMovie) {
        this.videoMovie = videoMovie;
    }
}
