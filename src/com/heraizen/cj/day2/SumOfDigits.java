package com.heraizen.cj.day2;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        sumOfDigit(n);
        sc.close();
	}
	static void sumOfDigit(int n) {
		int num=n;
		int sum=0;
		while(num>0) {
			  int temp=num%10;
			  sum=sum+temp;
			  num=num/10;
		}
		System.out.println("Number Of digit is "+sum);
	}
}
