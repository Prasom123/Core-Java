package com.heraizen.cj.day7.bankaccount;

public class Manager {
public static void main(String[] args)  {
	BankAccountImpl obj=new BankAccountImpl("Badal","Saving",6000);
	try {
	obj.withdraw(2000);
	}
	catch(InsufficientFundsException e){
		System.out.println(e);
	}
	
}
}
