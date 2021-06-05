package com.codegym.dto;

public class MoviesInfo {
    private String title;
    private String img_movie;
    private String category_name;

    public MoviesInfo() {
    }

    public MoviesInfo(String title, String img_movie, String category_name) {
        this.title = title;
        this.img_movie = img_movie;
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

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
