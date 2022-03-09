package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);
    Blog findById(int id);
}
