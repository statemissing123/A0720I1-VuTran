package com.example.demo.service;

import com.example.demo.model.UserFeedBack;

import java.util.List;

public interface UserService {
    List<UserFeedBack> findAll();
    void save(UserFeedBack userFeedBack);
    void delete(int id);
    UserFeedBack findById(int id);
}
