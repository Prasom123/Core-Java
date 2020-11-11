package com.heraizen.cj.day1;

import java.util.Scanner;

public class Swap {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.printf("Enter First Number =");
		int num1=sc.nextInt();
		System.out.printf("Enter Second Number =");
		int num2= sc.nextInt();
		
		SwapTwoNumber obj=new SwapTwoNumber();
		obj.swapingNumber(num1, num2);
	}

}
class SwapTwoNumber{
	int num1;
	int num2;
	
	
	void swapingNumber(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		int temp;
		System.out.println("Before swap, the values of "+this.num1+" and " +this.num2);
		
		temp=this.num1;
		this.num1=this.num2;
		this.num2=temp;
		
		System.out.println("After swap, the values of "+this.num1+" and " +this.num2);
		
	}
   
}
