package com.heraizen.cj.day1;

import java.util.Scanner;

public class Number {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num=sc.nextLong();
		EvenOdd obj=new EvenOdd();
		if(num>0) {
			obj.checkNumber(num);
		}
		else {
			System.out.println("Please enter the number in positive");
		}

	}

}
class EvenOdd{
	void checkNumber(long num) {
		if(num%2==0) {
			System.out.println("The entered  number "+num+" is even");
		}
		else {
			System.out.println("The entered  number "+num+" is odd");
		}
	}
}
