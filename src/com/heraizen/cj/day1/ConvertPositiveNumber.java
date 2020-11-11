package com.heraizen.cj.day1;

import java.util.Scanner;

public class ConvertPositiveNumber {

	private static Scanner sc;

	public static void main(String[] args) {
	 sc = new Scanner(System.in);
	 System.out.println("Enter Number in Negative:");
	 long num=sc.nextLong();
	 System.out.println("The Result is "+(-num));
	 
	}

}
