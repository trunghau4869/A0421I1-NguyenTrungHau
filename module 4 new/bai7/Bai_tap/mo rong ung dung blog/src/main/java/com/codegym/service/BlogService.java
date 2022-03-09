package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(int id);

    Blog findById(int id);
}
