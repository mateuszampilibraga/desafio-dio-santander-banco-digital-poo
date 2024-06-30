package com.meuBancoDigital.repository;

import com.meuBancoDigital.model.account.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts;

    public AccountRepository() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccountByAccountNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Or throw exception if not found
    }

    // Add more methods as needed for account management
}
