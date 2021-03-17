package com.codegym.crud.qlkhachhang.service.impl;

import com.codegym.crud.qlkhachhang.models.Customer;
import com.codegym.crud.qlkhachhang.respository.ICustomerRepository;
import com.codegym.crud.qlkhachhang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;


    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        iCustomerRepository.deleteById(id);
    }


    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id).orElse(null);
    }
}
