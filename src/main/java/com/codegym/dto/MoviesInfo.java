package com.codegym.dto;

public class MoviesInfo {
    private String title;
    private String img_movie;
    private String content;
    private String youtubeTrainer;
    private String videoMovie;
    private String category_name;

    public MoviesInfo() {
    }

    public MoviesInfo(String title, String img_movie, String content, String youtubeTrainer, String videoMovie, String category_name) {
        this.title = title;
        this.img_movie = img_movie;
        this.content = content;
        this.youtubeTrainer = youtubeTrainer;
        this.videoMovie = videoMovie;
        this.category_name = category_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_movie() {
        return img_movie;
    }

    public void setImg_movie(String img_movie) {
        this.img_movie = img_movie;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
