package dao.impl;

import dao.ICustomerDAO;
import model.Customer;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements ICustomerDAO {
    private static final String INSERT_CUSTOMER_SQL = "Insert into Customer(id, name, email, address) values (?, ?, ?, ?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from Customer where id = ?";
    private static final String SELECT_ALL_CUSTOMER = "Select * from Customer";
    private static final String DELETE_USER_BY_ID = "Delete from Customer where id = ?";
    private static final String UPDATE_USER = "Update Customer set name = ?, email = ?, address = ? where id = ?";

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);

        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getEmail());
        preparedStatement.setString(4, customer.getAddress());

        preparedStatement.executeUpdate();
    }

    @Override
    public Customer getCustomer(int id) throws SQLException {
        Customer customer = null;

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getNString("name");
            String email = resultSet.getNString("email");
            String address = resultSet.getNString("address");

            customer = new Customer(id, name, email, address);
        }


        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getNString("name");
            String email = resultSet.getNString("email");
            String address = resultSet.getNString("address");

            customerList.add(new Customer(id, name, email, address));
        }

        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getAddress());
        preparedStatement.setInt(4, customer.getId());

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public Customer getCusById(int id) {
        Customer customer = null;
        String query = "{CALL get_Customer_by_id}";
        try (Connection connection = DBConnection.getConnection();
             // Step 2:Create a statement using connection object
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, id);
            // Step 3: Execute the query or update query
            ResultSet rs = callableStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                customer = new Customer(id, name, email, country);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customer;
    }

    @Override
    public void insertCusStore(Customer customer) throws SQLException {
        String query = "{CALL insert_user(?,?,?)}";
        // try-with-resource statement will auto close the connection.
        try (Connection connection = DBConnection.getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setString(1, customer.getName());
            callableStatement.setString(2, customer.getEmail());
            callableStatement.setString(3, customer.getAddress());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
