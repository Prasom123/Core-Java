package com.heraizen.cj.day1;

import java.util.Scanner;

public class Discount {
 private static Scanner sc;

public static void main(String args[]) {
	 sc = new Scanner(System.in);
	 System.out.println("Enter the billig amount:");
	 long num=sc.nextLong();
	 
	 Test obj= new Test();
	 if(num>0) {
	 obj.discount(num);
	 }
	 else {
		System.out.println("Please Enter Number in Positive"); 
	 }
 }
}

class Test{
	long num;
	void discount(long num) {
		this.num=num;
		
		if(num>6000) {
		 long d=(num*10)/100;
		 long result;
		 result =num-d;
		 System.out.println("Your net billing amount: "+result);
		}
		else {
			System.out.println("Your net billing amount: "+num);
		}
		
	}
}