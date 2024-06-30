package com.meuBancoDigital.repository;

import com.meuBancoDigital.model.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerByDocument(String document) {
        for (Customer customer : customers) {
            if (customer.getDocument().equals(document)) {
                return customer;
            }
        }
        return null; // Or throw exception if not found
    }

    // Add more methods as needed for customer management
}
