package service.impl;

import model.Customers;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    public static Map<Integer,Customers> customersMap;

    static {
        customersMap = new HashMap<>();
        customersMap.put(1,new Customers(1,"Trần Lê Viết Vũ","1999-11-26","0123456789","0389183754","zittt2611@gmail.com","Tam Kỳ"));
        customersMap.put(2,new Customers(1,"Trần Lê Viết Vũ","1999-11-26","0123456789","0389183754","zittt2611@gmail.com","Tam Kỳ"));

    }
    @Override
    public List<Customers> findAll() {
        return new ArrayList<>(customersMap.values());
    }

    @Override
    public void save(Customers customers) {
        customersMap.put(customers.getId(),customers);

    }

    @Override
    public Customers findById(int id) {
        return customersMap.get(id);
    }

    @Override
    public void update(int id, Customers customer) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Customers> findByName(String name) {
        return null;
    }
}
