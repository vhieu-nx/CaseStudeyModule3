package com.codegym.model;

public class MovieModel {
    private int movie_id;
    private String title;
    private String content;
    private String description;
    private String image_movie;
    private String youtubeTrainer;
    private String videoMovie;

    public MovieModel() {
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
