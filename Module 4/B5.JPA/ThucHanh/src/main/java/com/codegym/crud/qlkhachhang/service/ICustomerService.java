package com.codegym.crud.qlkhachhang.service;

import com.codegym.crud.qlkhachhang.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);


}
