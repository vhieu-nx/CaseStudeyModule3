package com.codegym.dao;

import com.codegym.model.UserModel;

public interface IUserDAO extends InterfaceDAO<UserModel>{
    UserModel findUserName(String name,String password);
    UserModel findByEmail(String email);
    void updateUser(String email, UserModel userModel);



}
