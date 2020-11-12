package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept 3 numbers from the user and find the biggest of them.
 * @author prasom
 *
 */
public class GreaterThan3Number {

	public static void main(String[] args) {
		
    GreaterNumber obj=new GreaterNumber();
    obj.checkNumberIsGreater();
	}

}
class GreaterNumber{
	
	/**
	 * 
	 * @param using this method to get the biggest number between 3 number
	 */
	void checkNumberIsGreater() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		System.out.println("Enter the second number :");
		int num2=sc.nextInt();
		System.out.println("Enter the third number :");
		int num3 =sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The biggest of the 3 numbers entered is" +num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("The biggest of the 3 numbers entered is" +num2);
		}
		else  if(num3>num1 && num3>num2){
			System.out.println("The biggest of the 3 numbers entered is" +num3);
		}
		sc.close();
	}
}
