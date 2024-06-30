package com.meuBancoDigital.model.customer;

public class Customer {
    private String name;
    private String document;
    private Address address;

    public Customer(String name, String document, Address address) {
        this.name = name;
        this.document = document;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", address=" + address +
                '}';
    }
}
