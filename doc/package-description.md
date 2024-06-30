# Descrição dos Pacotes

## com.meuBancoDigital.app

Este pacote conterá a classe principal que inicializa a aplicação.

## com.meuBancoDigital.model

Contém as classes que representam o modelo do domínio da aplicação.
- com.meuBancoDigital.model.account: Classes relacionadas a contas bancárias (ex: Account, CheckingAccount, SavingsAccount).
- com.meuBancoDigital.model.customer: Classes relacionadas a clientes (ex: Customer, Address).
- com.meuBancoDigital.model.transaction: Classes relacionadas a transações (ex: Transaction, Transfer, Deposit, Withdrawal).

## com.meuBancoDigital.repository

Contém classes responsáveis pelo acesso e manipulação dos dados (ex: AccountRepository, CustomerRepository).

## com.meuBancoDigital.service

Contém as classes de serviços que encapsulam a lógica de negócios da aplicação (ex: AccountService, CustomerService, TransactionService).

## com.meuBancoDigital.exception

Contém as classes de exceções personalizadas usadas na aplicação (ex: AccountNotFoundException, InsufficientFundsException).

## com.meuBancoDigital.util

Contém classes utilitárias que fornecem funcionalidades auxiliares (ex: DateUtil, ValidationUtil).

## com.meuBancoDigital.controller

Contém as classes que tratam das interações com o usuário ou a interface da aplicação, como controladores REST para uma API web ou controladores GUI para uma aplicação de desktop (ex: AccountController, CustomerController).
