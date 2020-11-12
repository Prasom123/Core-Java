package com.heraizen.cj.day2;

import java.util.Scanner;

public class FactorialWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        getFactorial(n);
        sc.close();
	}
	static void getFactorial(int n) {
		int num=n;
		int res=1;
		while(num>0) {
			res=res*num;
			num--;
		}
	   			
		
		System.out.println("Number Of Factorial Number  digit is "+res);
	}
}
