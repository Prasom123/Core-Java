package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number and determine whether it is a prime number or not.
 * @author prasom
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Prime obj=new Prime();
		obj.checkPrimeNumber();

	}

}

class Prime{
	void checkPrimeNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		boolean flag=true;
		if(num<=0) {
			System.out.println("Please Enter Positive Number");
		}
		else if(num==2 || num==3) {
			System.out.println("The entered number "+num+ " is a prime number ");
		}
		else if(num>3 ) {
			for(int i=2 ; i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println("The entered number "+num+ " is a prime number ");
			}
			else {
				System.out.println("The entered number "+num+ " is not a prime number ");
			}
		}
		sc.close();
	}
}