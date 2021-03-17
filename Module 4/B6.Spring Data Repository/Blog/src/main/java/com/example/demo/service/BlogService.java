package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    void delete(int id);
    Blog findById(int id);
    Page<Blog>findAllByTitleBlogContaining(String titleBlog, Pageable pageable);
}
