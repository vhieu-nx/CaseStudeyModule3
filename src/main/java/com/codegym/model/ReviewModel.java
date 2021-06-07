package com.codegym.model;

public class ReviewModel {
    private int id;
    private  String userLogin;
    private String userAvatarPath;

    public ReviewModel(int id, int userId, int movieId, String text) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.text = text;
    }

    private int userId;
    private int movieId;
    private String text;
    public ReviewModel(int id, String userLogin, String userAvatarPath, String text, int userId, int movieId) {
        this.id = id;
        this.userLogin = userLogin;
        this.userAvatarPath = userAvatarPath;
        this.text = text;
        this.userId = userId;
        this.movieId = movieId;
    }

    public ReviewModel(int userId, int movieId, String text) {
        this.userId = userId;
        this.movieId = movieId;
        this.text = text;
    }

    public ReviewModel(String userLogin, String userAvatarPath, String text, int userId, int movieId) {
        this.userLogin = userLogin;
        this.userAvatarPath = userAvatarPath;
        this.text = text;
        this.userId = userId;
        this.movieId = movieId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserAvatarPath() {
        return userAvatarPath;
    }

    public void setUserAvatarPath(String userAvatarPath) {
        this.userAvatarPath = userAvatarPath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
