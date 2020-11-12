package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to generate the first 'N' natural numbers and print them in descending order.
 * @author prasom
 *
 */
public class DecendNaturalNumber {

	public static void main(String[] args) {
		NaturalNumberOrder obj=new NaturalNumberOrder();
		obj.getnaturalNumberDecendingOrder();
	}

}
class NaturalNumberOrder{
	
	//Getting Natural Number in Decending Order
	
	void getnaturalNumberDecendingOrder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int num=sc.nextInt();
		System.out.printf("First "+num+ " natural numbers in descending order are :");
		for(int i=num; i>=1;i--) {
			System.out.printf(i+" ");
		}
		sc.close();
	}
}