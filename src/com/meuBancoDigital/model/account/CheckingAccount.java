package com.meuBancoDigital.model.account;

import com.meuBancoDigital.model.customer.Customer;

public class CheckingAccount extends Account {

    public CheckingAccount(int branch, int accountNumber, Customer customerOwner, double initialBalance) {
        super(branch, accountNumber, customerOwner, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
    }
}
