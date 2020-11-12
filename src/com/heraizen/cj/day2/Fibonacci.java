package com.heraizen.cj.day2;

import java.util.Scanner;

/***
 *  Write a program to accept a number and print the Fibonacci series up to the entered number.
 * @author prasom
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		FibonacciSeries obj=new FibonacciSeries();
		obj.getFibonaciNumber();
       
	}

}
class FibonacciSeries{
	//Getting Fibonacci series
	void getFibonaciNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.printf("Fibonacci series up to the entered number is: "+num1+" "+num2);
		for(int i=3; i<n; i++) {
			int num3;
			num3=num1+num2;
			System.out.printf(" "+num3);
			num1=num2;
			num2=num3;
			
		}
		sc.close();
	}
}
