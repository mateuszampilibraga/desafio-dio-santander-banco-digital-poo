package com.meuBancoDigital.app;

import com.meuBancoDigital.controller.AccountController;
import com.meuBancoDigital.exception.AccountNotFoundException;
import com.meuBancoDigital.exception.InsufficientFundsException;
import com.meuBancoDigital.model.account.Account;
import com.meuBancoDigital.model.account.CheckingAccount;
import com.meuBancoDigital.model.customer.Customer;
import com.meuBancoDigital.model.customer.Address;
import com.meuBancoDigital.repository.AccountRepository;
import com.meuBancoDigital.service.AccountService;
import com.meuBancoDigital.util.DateUtil;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Criando instância de AccountRepository
        AccountRepository accountRepository = new AccountRepository();

        // Criando instâncias dos serviços e controladores
        AccountService accountService = new AccountService(accountRepository);
        AccountController accountController = new AccountController(accountService);

        // Criando dados de exemplo para um cliente
        Address address = new Address("Rua Principal", "Cidade Exemplo", "Estado");
        Customer customer = new Customer("João da Silva", "123.456.789-00", address);

        // Criando uma conta bancária para o cliente
        Account account = new CheckingAccount(1, 12345, customer, 1000.0);

        try {
            // Criando a conta através do controlador
            accountController.createAccount(account);

            // Realizando operações na conta de exemplo
            accountController.deposit(account, 500.0);
            accountController.withdraw(account, 200.0);

            // Exibindo informações da conta após as operações
            System.out.println("Saldo atual da conta: " + account.getBalance());

        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.err.println("Erro ao processar operação: " + e.getMessage());
        }

        // Exemplo de utilização do DateUtil para formatar uma data
        LocalDate date = LocalDate.now();
        String formattedDate = DateUtil.format(date, "dd/MM/yyyy");
        System.out.println("Data formatada: " + formattedDate);
    }
}
