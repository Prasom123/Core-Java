package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number and find its factorial.
 * @author prasom
 *
 */

public class Factorial {

	public static void main(String[] args) {
		Factorial.getFactorial();
	}
	
  static void getFactorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int res=1;
		System.out.printf("The factorial of "+n+" is");
		for(int i=1; i<=n; i++) {
			res*=i;
		
		}
		System.out.printf(" "+res);
		sc.close();
	}

}
