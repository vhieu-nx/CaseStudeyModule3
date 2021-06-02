package com.codegym.dao;

import com.codegym.model.CategoryModel;

import java.util.List;

public interface CategoryDao {

//    thêm
    void insert(CategoryModel categoryModel);

//sửa
    void update(CategoryModel categoryModel);

//xóa
    void delete(Long categoryId);

//lấy danh sách thể loại
    List<CategoryModel> showAll();

//đếm tổng số category
    Long count();

    CategoryModel getById(Long id);

}
