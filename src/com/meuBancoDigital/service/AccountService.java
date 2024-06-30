package com.meuBancoDigital.service;

import com.meuBancoDigital.model.account.Account;
import com.meuBancoDigital.repository.AccountRepository;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account) {
        accountRepository.addAccount(account);
    }

    public Account findAccountByAccountNumber(int accountNumber) {
        return accountRepository.findAccountByAccountNumber(accountNumber);
    }

    // Add more methods as needed for account business logic
}
