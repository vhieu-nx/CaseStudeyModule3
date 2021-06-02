package com.codegym.model;

import java.util.List;

public class CategoryModel<MovieMOdel> {
    private int category_id;
    private String name;
    private List<MovieMOdel> movieModel;

    public CategoryModel(int category_id, String name, List<MovieMOdel> moviemodel) {
        this.category_id = category_id;
        this.name = name;
        this.movieModel = movieModel;
    }

    public CategoryModel() {

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

    public List<MovieMOdel> getMoviemodel() {
        return movieModel;
    }

    public void setMoviemodel(List<MovieMOdel> moviemodel) {
        this.movieModel = movieModel;
    }
}
