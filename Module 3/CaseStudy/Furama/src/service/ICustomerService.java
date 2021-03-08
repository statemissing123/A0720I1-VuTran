package service;

import model.Customers;

import java.util.List;

public interface ICustomerService {
    List<Customers> findAll();

    void save(Customers customers);

    Customers findById(int id);

    void update(int id, Customers customer);

    void remove(int id);

    List<Customers> findByName(String name);
}
