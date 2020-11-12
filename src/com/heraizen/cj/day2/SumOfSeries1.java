package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.
 * @author prasom
 *
 */
public class SumOfSeries1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		SumOfSeries1.getSumOfSeries(n);
        sc.close();
	}
   static void getSumOfSeries(int n){
		int num=n;
		double res=0;
		for(double i=1 ; i<=num ;i++) {
			res=res+1/i;
		}
		System.out.println(res);
	}
   

}
