package com.codegym.casestudy.Service;

import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);
    Page<Customer>findAllByNameContaining(String name,Pageable pageable);

}
