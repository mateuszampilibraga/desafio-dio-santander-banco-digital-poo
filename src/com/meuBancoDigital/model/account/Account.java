package com.meuBancoDigital.model.account;

import com.meuBancoDigital.model.customer.Customer;

public abstract class Account {
    private int branch;
    private int accountNumber;
    private Customer customerOwner;
    private double balance;

    public Account(int branch, int accountNumber, Customer customerOwner, double initialBalance) {
        this.branch = branch;
        this.accountNumber = accountNumber;
        this.customerOwner = customerOwner;
        this.balance = initialBalance;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomerOwner() {
        return customerOwner;
    }

    public void setCustomerOwner(Customer customerOwner) {
        this.customerOwner = customerOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
    }

    public void transfer(double amount, Account targetAccount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds for transfer");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "branch=" + branch +
                ", accountNumber=" + accountNumber +
                ", customerOwner=" + customerOwner +
                ", balance=" + balance +
                '}';
    }
}
