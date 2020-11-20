package com.heraizen.cj.day7.bankaccount;

public class BankAccountImpl implements BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance;

	BankAccountImpl(String custName, String accType, float balance) {
		this.accNo = AccountNumberGenerator.getAccountNumber();
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
    
@Override
public 	float getBalance() {
		return balance;
	}
@Override
public void deposit(int amount) {
	if (amount >= 0) {
		balance += amount;
	} else {
		 throw new NegativeAmountException("Negative Amount Exception");
	}
	
}
@Override
public void withdraw(int amount) throws InsufficientFundsException  {
	if (accType == "Current") {
		if (amount > balance - 5000) {
			throw new InsufficientFundsException("Insufficient funds");
		} else {
			balance -= amount;
			System.out.println(this.getBalance());
		}
	} else if(accType=="Saving") {
		if(amount>balance-1000) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		else {
			balance-=amount;
			System.out.println(this.getBalance());
		}
	}
	
}
}
