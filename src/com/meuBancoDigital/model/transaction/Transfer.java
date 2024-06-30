package com.meuBancoDigital.model.transaction;

import com.meuBancoDigital.model.account.Account;

public class Transfer extends Transaction {
    private Account sourceAccount;
    private Account targetAccount;

    public Transfer(double amount, Account sourceAccount, Account targetAccount) {
        super(amount);
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getTargetAccount() {
        return targetAccount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "timestamp=" + getTimestamp() +
                ", amount=" + getAmount() +
                ", sourceAccount=" + sourceAccount.getAccountNumber() +
                ", targetAccount=" + targetAccount.getAccountNumber() +
                '}';
    }
}
