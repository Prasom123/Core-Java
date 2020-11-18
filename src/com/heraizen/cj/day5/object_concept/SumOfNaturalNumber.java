package com.heraizen.cj.day5.object_concept;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		SumOfNaturalNumber.naturalNumber();
	}
 static	void naturalNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		System.out.println("Sum "+num+ " natural numbers are :"+sum);
		sc.close();
	}
}

