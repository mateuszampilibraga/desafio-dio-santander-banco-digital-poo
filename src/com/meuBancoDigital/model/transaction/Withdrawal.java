package com.meuBancoDigital.model.transaction;

import com.meuBancoDigital.model.account.Account;

import java.time.LocalDateTime;

public class Withdrawal extends Transaction {
    private Account account;

    public Withdrawal(double amount, Account account) {
        super(amount);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "timestamp=" + getTimestamp() +
                ", amount=" + getAmount() +
                ", account=" + account.getAccountNumber() +
                '}';
    }
}
