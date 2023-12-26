package com.example.customermanagement.model.service;

import com.example.customermanagement.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
}
