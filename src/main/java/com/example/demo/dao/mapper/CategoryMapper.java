package com.example.demo.dao.mapper;

import com.example.demo.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {
    public List<Category> getAllCategory();
    public Category getCategoryById(int categoryId);
}
