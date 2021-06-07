package com.codegym.model;

import java.util.ArrayList;
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
    private int id_category;
    private Integer page;
    private Integer maxPageItem = 5;
    private Integer totalPage;
    private Integer totalItem;
    private String sortName;
    private String sortBy;
    private String alert;
    private String message;
    private String type;
    private List<MovieModel> lisResult = new ArrayList<>();

    public MovieModel() {
    }

    public List<MovieModel> getLisResult() {
        return lisResult;
    }

    public void setLisResult(List<MovieModel> lisResult) {
        this.lisResult = lisResult;
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

    public MovieModel(String id1, String title, String content, String description, String image_movie, String trainer, String video) {
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public Integer getMaxPageItem() {
        return maxPageItem;
    }

    public void setMaxPageItem(Integer maxPageItem) {
        this.maxPageItem = maxPageItem;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
