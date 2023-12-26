package com.example.customermanagement.model.service;

import com.example.customermanagement.model.dao.CustomerDAO;
import com.example.customermanagement.model.entity.Customer;

import java.util.List;

public class CustomerServiceFactory implements CustomerService{
    private CustomerDAO customerDAO;
    private static CustomerServiceFactory instance;

    private CustomerServiceFactory() {
        customerDAO = new CustomerDAO();
    }

    public static CustomerServiceFactory getInstance() {
        if (instance == null) {
            instance = new CustomerServiceFactory();
        }
        return instance;
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }
}
