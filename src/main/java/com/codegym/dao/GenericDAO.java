package com.codegym.dao;


import com.codegym.mapper.RowMapper;

import java.util.List;

public interface GenericDAO <T>{
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
    void update (String sql, Object... parameters);
    Integer insert (String sql, Object... parameters);
    int count(String sql, Object... parameters);
}
