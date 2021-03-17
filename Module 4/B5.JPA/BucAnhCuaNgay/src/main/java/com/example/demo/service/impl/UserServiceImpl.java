package com.example.demo.service.impl;

import com.example.demo.model.UserFeedBack;
import com.example.demo.respository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserFeedBack> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(UserFeedBack userFeedBack) {
        userRepository.save(userFeedBack);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserFeedBack findById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
