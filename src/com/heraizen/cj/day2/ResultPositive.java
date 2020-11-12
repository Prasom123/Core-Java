package com.heraizen.cj.day2;

import java.util.Scanner;

/***
 * Write a program to accept two numbers num1 and num2;
 * when one is subtracted from the other, the result should always be a positive number.
 * @author prasom
 *
 */

public class ResultPositive {

	public static void main(String[] args) {
	
    PositiveResults obj = new PositiveResults();
    obj.getPositiveResult();
	}

}
class PositiveResults{
	
	//Method for getting positive result when subtracting two numbers
	void getPositiveResult() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int result=(num1-num2);
		if(result<0) {
			System.out.println("The result (difference) is: "+ (-result));
		}
		else {
			System.out.println("The result (difference) is: "+ (result));
		}
		sc.close();
		
	}
}