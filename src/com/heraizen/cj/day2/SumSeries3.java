package com.heraizen.cj.day2;

import java.util.Scanner;

/***
 * Write a program to accept a number “n” from the user; find the sum of the series 1/23+1/33+1/43……..+1/n3
 * @author prasom
 *
 */
public class SumSeries3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers ");
		int n=sc.nextInt();
		System.out.println("Sum Of Series "+getSumOfSeries(n));
        sc.close();

	}
   static double getSumOfSeries(int n) {
	   int num=n;
		double res=0;
		for(double i=1 ; i<=num ;i++) {
			res=res+ 1/Math.pow((i+1), 3);
		}
		
	   return res;
   }
}
