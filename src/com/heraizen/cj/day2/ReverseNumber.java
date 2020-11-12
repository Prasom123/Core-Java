package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number from the user and find the reverse of the entered number.
 * @author prasom
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        reverseNumber(n);
        sc.close();
	}
	static void reverseNumber(int n) {
		int num=n;
		int rev=0;
		while(num>0) {
			  int temp=num%10;
			  rev=rev*10+temp;
			  num=num/10;
		}
		System.out.println("Number Of digit is "+rev);
	}
}
