package com.example.test;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class DependencyInjectionTest {

    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to get customer details
        String customer1 = customerService.getCustomerDetails("1");
        System.out.println("Customer 1: " + customer1);

        String customer2 = customerService.getCustomerDetails("2");
        System.out.println("Customer 2: " + customer2);
    }
}