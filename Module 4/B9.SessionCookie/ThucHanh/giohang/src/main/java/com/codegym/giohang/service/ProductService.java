package com.codegym.giohang.service;

import com.codegym.giohang.model.Product;

import java.util.List;
import java.util.Map;


public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    void delete (int id);
    Product findById(int id);
}
