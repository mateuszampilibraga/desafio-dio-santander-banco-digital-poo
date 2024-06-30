package com.meuBancoDigital.repository;

import com.meuBancoDigital.model.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private List<Transaction> transactions;

    public TransactionRepository() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    // Implement other methods as needed, such as finding transactions by account, date range, etc.
}
