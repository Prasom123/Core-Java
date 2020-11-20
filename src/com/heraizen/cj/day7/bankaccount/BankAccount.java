package com.heraizen.cj.day7.bankaccount;

public interface BankAccount {
   void deposit(int amount);
   void withdraw(int amount) throws InsufficientFundsException;
   float getBalance();
}
