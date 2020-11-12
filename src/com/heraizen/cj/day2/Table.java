package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number from the user and print its multiplication table (upto “times 10”).
 * @author prasom
 *
 */
public class Table {

	public static void main(String[] args) {
		MultiplicationTable obj=new MultiplicationTable();
		obj.getNumberTable();
	}

}

class MultiplicationTable{
	
	void getNumberTable(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		int n=sc.nextInt();
		System.out.println("Multiplication table for "+n +" is :");
		for(int i=1; i<=10 ;i++) {
			System.out.println(n+" * "+ i+ " = "+n*i);
		}
		sc.close();
	}
}