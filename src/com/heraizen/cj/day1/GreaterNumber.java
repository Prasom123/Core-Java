package com.heraizen.cj.day1;

import java.util.Scanner;

public class GreaterNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		long num1=sc.nextLong();
		System.out.println("Enter the Second number:");
		long num2=sc.nextLong();
		long bigNumber;
		Numbers obj=new Numbers();
		bigNumber=obj.checkBiggerNumber(num1, num2);
		System.out.println("The Biggest Number is : "+bigNumber);
	}

}

class Numbers{
	long checkBiggerNumber(long num1, long num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}