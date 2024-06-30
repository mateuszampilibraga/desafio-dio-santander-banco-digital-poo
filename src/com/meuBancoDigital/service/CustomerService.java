package com.meuBancoDigital.service;

import com.meuBancoDigital.model.customer.Customer;
import com.meuBancoDigital.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    public Customer findCustomerByDocument(String document) {
        return customerRepository.findCustomerByDocument(document);
    }

    // Add more methods as needed for customer business logic
}
