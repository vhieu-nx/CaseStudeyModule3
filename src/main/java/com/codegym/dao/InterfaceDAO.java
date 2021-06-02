package com.codegym.dao;

import com.codegym.model.MovieModel;

import java.util.List;

public interface InterfaceDAO<T> {
    List<T> showAll();

    void save(T t);

    void update(int id,T t);

    void delete(int id);

    T findById(int id);

    List<T> findListById(int id);

    T findByName(String name);
}
