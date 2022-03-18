package com.codegym.repository;

import com.codegym.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {
    List<Category> findCategoryList();
    void save(Category category);
    void delete(int id);
}
