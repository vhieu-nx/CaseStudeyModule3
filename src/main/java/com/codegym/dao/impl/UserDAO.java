package com.codegym.dao.impl;

import com.codegym.dao.IUserDAO;
import com.codegym.model.UserModel;

import java.util.List;

public class UserDAO extends AbtractDAO<UserModel> implements IUserDAO {
    @Override
    public List<UserModel> showAll() {
        return null;
    }

    @Override
    public void save(UserModel userModel) {

    }

    @Override
    public void update(int id, UserModel userModel) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public UserModel findById(int id) {
        return null;
    }

    @Override
    public List<UserModel> findListById(int id) {
        return null;
    }

    @Override
    public UserModel findByName(String name) {
        return null;
    }
}
