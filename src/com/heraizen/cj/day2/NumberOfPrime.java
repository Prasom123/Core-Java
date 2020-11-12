package com.heraizen.cj.day2;

import java.util.Scanner;

/***
 * Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.
 * @author prasom
 *
 */
public class NumberOfPrime {

	public static void main(String[] args) {
		TotalPrimeNumber obj=new TotalPrimeNumber();
		obj.getTotalPrimeNumber();

	}

}
class TotalPrimeNumber{
	
	void getTotalPrimeNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower Bound Number:");
		int lowerBound=sc.nextInt();
		System.out.println("Enter Upper Bound Number:");
		int upperBound=sc.nextInt();
		boolean flag;
		 System.out.printf("The prime numbers between"+lowerBound+ " and "+upperBound+ " are: ");
		 for (int i = lowerBound ; i <= upperBound; i++) {
	            if (i == 1 || i == 0) {
	            	continue;
	            }
	                
	            flag = true;
	 
	            for (int j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = false;
	                    break;
	                }
	            }
	      
	            if (flag == true) {
	               System.out.printf(i+" ");
	            }
	        }
	    sc.close();
	}
}