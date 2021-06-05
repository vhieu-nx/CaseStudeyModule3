package com.codegym.model;

import java.util.List;

public class CategoryModel {
    private int category_id;
    private String name;
    private List<MovieModel> movieModel ;

    public CategoryModel() {
    }

    public CategoryModel(String name) {
        this.name = name;
    }

    public CategoryModel(int category_id) {
        this.category_id = category_id;
    }

    public CategoryModel(int category_id, String name, List<MovieModel> movieModel) {
        this.category_id = category_id;
        this.name = name;
        this.movieModel = movieModel;
    }

    public CategoryModel(int category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }



    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MovieModel> getMovieModel() {
        return movieModel;
    }

    public void setMovieModel(List<MovieModel> movieModel) {
        this.movieModel = movieModel;
    }
}
