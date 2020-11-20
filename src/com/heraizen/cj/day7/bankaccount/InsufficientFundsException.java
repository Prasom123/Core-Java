package com.heraizen.cj.day7.bankaccount;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InsufficientFundsException(String s){  
		  super(s);  
		 }  
}
