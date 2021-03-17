package com.codegym.crud.qlkhachhang.service;

import com.codegym.crud.qlkhachhang.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);


}
