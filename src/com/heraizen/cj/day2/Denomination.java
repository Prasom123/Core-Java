package com.heraizen.cj.day2;

import java.util.Scanner;

public class Denomination {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        getDomination(n);
        sc.close();
	}
	static void getDomination(int n) {
		int num=n;
		int count=0;
		while(num>0) {
			  num=num/10;
			 count++;
		}
		int num1=n;
		while(num1>0) {
			int temp=num1%10;
			int a=1;
			for(int i=count-1; i>=1; i--) {
			     a*=10;
			}
			System.out.println(a*temp);
			a=1;
			num1=num1/10;
			count--;
		}
		
	}
}
