package com.heraizen.cj.day7.bankaccount;

public class NegativeAmountException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
    String message;
	NegativeAmountException(String message){
		super(message);
		this.message=message;
	}
}
