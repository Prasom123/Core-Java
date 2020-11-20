package com.heraizen.cj.day7.bankaccount;

public class AccountNumberGenerator {
  private static int accNumber=1472;
  private AccountNumberGenerator() {
	  
  }
   public static int  getAccountNumber() {
	   return accNumber++;
   }
}
