package com.heraizen.cj.day2;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        numberOfDigit(n);
        sc.close();
	}
	static void numberOfDigit(int n) {
		int num=n;
		int count=0;
		while(num>0) {
			  num=num/10;
			 count++;
		}
		System.out.println("Number Of digit is "+count);
	}

}
