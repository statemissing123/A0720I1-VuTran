package com.codegym.casestudy.Service;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    void save(Employee employee);
    void delete(int id);
    Employee findById(int id);
    Page<Employee>findAllByNameContaining(String name,Pageable pageable);
}
