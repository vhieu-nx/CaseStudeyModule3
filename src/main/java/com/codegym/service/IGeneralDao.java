package com.codegym.service;

import java.util.List;

public interface IGeneralDao<T> {
    void insert(T t,int[] categories);
    T selectUserByID(int id);
    List<T> selectUserByName(String inputSearch);
    List<T> selectAll();
    void delete(int id);
    void update(T t);

}
