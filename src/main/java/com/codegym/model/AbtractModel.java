package com.codegym.model;

import java.util.ArrayList;
import java.util.List;

public class AbtractModel <T>{
    private Integer id;
    private List<T> listResult = new ArrayList<>();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List<T> getListResult() {
        return listResult;
    }
    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }
}
