package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 *   Write a program to add the first 7 terms of the following series using a for loop:
 *   1/1!+2/2!+3 /3!+....
 * @author prasom
 *
 */
public class Series3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        getSumOfSeries(n);
        sc.close();
	}
	static void getSumOfSeries(int n) {
		int num=n;
		double fact=1;
		double sum=0;
		for(int i=1;i<=num;i++) {
			
			for(int j=1 ; j<=i ; j++ ) {
				fact*=j;
			}
			sum+=(1/fact);
			fact=1;
			
		}
		System.out.println("Sum of Series: "+sum);
	}
}
