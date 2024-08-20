package com.example.repository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("1", "Mary Johnson");
        customers.put("2", "Mary Johnson");
    }

    @Override
    public String findCustomerById(String id) {
        return customers.get(id);
    }
}