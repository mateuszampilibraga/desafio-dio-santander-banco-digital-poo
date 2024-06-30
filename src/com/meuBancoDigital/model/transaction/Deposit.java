package com.meuBancoDigital.model.transaction;

import com.meuBancoDigital.model.account.Account;

public class Deposit extends Transaction {
    private Account account;

    public Deposit(double amount, Account account) {
        super(amount);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "timestamp=" + getTimestamp() +
                ", amount=" + getAmount() +
                ", account=" + account.getAccountNumber() +
                '}';
    }
}
