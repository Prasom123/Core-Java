package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and find the sum of the numbers in this series.

 * @author prasom
 *
 */
public class SumOfSeries2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of terms");
		double n=sc.nextInt();
	    System.out.println("Sum of series "+getSumOfSeries(n));	
       sc.close();
	}
   static double getSumOfSeries(double n){
   	double num=n;
   	
   	double res=(num/2)*(2*1+(num-1)*2);
   	return res;
   }
}
