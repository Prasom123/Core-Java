package com.heraizen.cj.day5.object_concept;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num=sc.nextInt();
		int factorial =facto(num);
		System.out.println(factorial);
		sc.close();
	}
  static	int facto(int num){
		if(num>1) {
			return num*facto(num-1);
		}
		return 1;
	}
 
}
