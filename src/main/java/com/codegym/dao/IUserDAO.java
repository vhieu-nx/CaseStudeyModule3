package com.codegym.dao;

import com.codegym.model.UserModel;

public interface IUserDAO extends InterfaceDAO<UserModel>{
    UserModel findUserName(String email,String password);

}
