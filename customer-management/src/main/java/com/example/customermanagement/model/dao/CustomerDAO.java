package com.example.customermanagement.model.dao;

import com.example.customermanagement.model.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/customer";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Modicung2486!";
    private final String SELECT_ALL_CUSTOMER ="select * from customer;";
    private final String SELECT_CUSTOMER_BY_ID ="select * from customer where id = ?;";

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                Customer customer = new Customer(id, name, email, address);
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;

    }

    public Customer findById(int id) {
        Customer customers = null;
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                 customers = new Customer(id, name, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;

    }



}
