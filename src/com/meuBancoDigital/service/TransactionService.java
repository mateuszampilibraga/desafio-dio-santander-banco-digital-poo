package com.meuBancoDigital.service;

import com.meuBancoDigital.model.account.Account;
import com.meuBancoDigital.model.transaction.Deposit;
import com.meuBancoDigital.model.transaction.Transfer;
import com.meuBancoDigital.model.transaction.Withdrawal;
import com.meuBancoDigital.repository.AccountRepository;
import com.meuBancoDigital.repository.TransactionRepository;

public class TransactionService {
    private AccountRepository accountRepository;
    private TransactionRepository transactionRepository;

    public TransactionService(AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    public void deposit(Account account, double amount) {
        Deposit deposit = new Deposit(amount, account);
        account.deposit(amount);
        transactionRepository.addTransaction(deposit);
    }

    public void withdraw(Account account, double amount) {
        Withdrawal withdrawal = new Withdrawal(amount, account);
        account.withdraw(amount);
        transactionRepository.addTransaction(withdrawal);
    }

    public void transfer(Account sourceAccount, Account targetAccount, double amount) {
        Transfer transfer = new Transfer(amount, sourceAccount, targetAccount);
        sourceAccount.transfer(amount, targetAccount);
        transactionRepository.addTransaction(transfer);
    }

    // Add more methods as needed for transaction business logic
}
