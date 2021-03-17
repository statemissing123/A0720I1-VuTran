package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void delete(int id);
    Blog findById(int id);
}
