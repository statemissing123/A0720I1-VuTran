package com.codegym.crud.qlkhachhang.respository;

import com.codegym.crud.qlkhachhang.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
