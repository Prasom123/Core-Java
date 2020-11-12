package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.
 * @author prasom
 *
 */
public class NaturalNumber {

	public static void main(String[] args) {
		Number obj=new Number();
		obj.naturalNumber();
	}

}

class Number{
	void naturalNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int num=sc.nextInt();
		System.out.printf("First "+num+ " natural numbers are :");
		for(int i=1; i<=num;i++) {
			System.out.printf(i+" ");
		}
		sc.close();
	}
}