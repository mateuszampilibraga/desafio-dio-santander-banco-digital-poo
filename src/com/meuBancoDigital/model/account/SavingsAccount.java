package com.meuBancoDigital.model.account;

import com.meuBancoDigital.model.customer.Customer;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int branch, int accountNumber, Customer customerOwner, double initialBalance, double interestRate) {
        super(branch, accountNumber, customerOwner, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "branch=" + getBranch() +
                ", accountNumber=" + getAccountNumber() +
                ", customerOwner=" + getCustomerOwner() +
                ", balance=" + getBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}
