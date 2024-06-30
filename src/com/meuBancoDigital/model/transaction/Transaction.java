package com.meuBancoDigital.model.transaction;

import java.time.LocalDateTime;

public abstract class Transaction {
    private LocalDateTime timestamp;
    private double amount;

    public Transaction(double amount) {
        this.timestamp = LocalDateTime.now();
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "timestamp=" + timestamp +
                ", amount=" + amount +
                '}';
    }
}
