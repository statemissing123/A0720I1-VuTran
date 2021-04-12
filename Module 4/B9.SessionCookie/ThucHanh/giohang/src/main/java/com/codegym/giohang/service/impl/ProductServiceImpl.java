package com.codegym.giohang.service.impl;

import com.codegym.giohang.model.Product;
import com.codegym.giohang.repository.ProductRepository;
import com.codegym.giohang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
//    public static Map<Integer,Product> productMap;
//    static {
//        productMap = new HashMap<>();
//        productMap.put(1,new Product(1,"GTX 2060 ti",300000));
//        productMap.put(2,new Product(2,"GTX 1080 ti",200000));
//    }
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
