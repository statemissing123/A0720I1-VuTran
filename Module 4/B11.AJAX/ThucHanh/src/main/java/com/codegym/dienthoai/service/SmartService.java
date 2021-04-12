package com.codegym.dienthoai.service;

import com.codegym.dienthoai.model.Smartphone;

public interface SmartService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    void remove(Integer id);
}
