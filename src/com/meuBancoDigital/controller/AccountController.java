package com.meuBancoDigital.controller;

import com.meuBancoDigital.model.account.Account;
import com.meuBancoDigital.service.AccountService;

public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public void createAccount(Account account) {
        accountService.createAccount(account);
        System.out.println("Account created successfully: " + account.getAccountNumber());
    }

    public void findAccount(int accountNumber) {
        Account account = accountService.findAccountByAccountNumber(accountNumber);
        if (account != null) {
            System.out.println("Account found: " + account);
        } else {
            System.out.println("Account not found for account number: " + accountNumber);
        }
    }

    public void deposit(Account account, double v) {
    }

    public void withdraw(Account account, double v) {
    }

    // Add more methods as needed for account controller operations
}
