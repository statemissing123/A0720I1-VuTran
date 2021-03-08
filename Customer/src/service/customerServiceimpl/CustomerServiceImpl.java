package service.customerServiceimpl;

import model.Customer;
import service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    public static Map<Integer,Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1,new Customer(1,"Vu","zittt2611@gmail.com","Tamky"));
        customerMap.put(2,new Customer(2,"Linh","Linh1609@gmail.com","Tamky"));
        customerMap.put(3,new Customer(3,"Cuong","Cuong0112@gmail.com","TamXuan"));
        customerMap.put(4,new Customer(4,"Quoc","Quoc2507@gmail.com","TamXuan"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void edit(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
