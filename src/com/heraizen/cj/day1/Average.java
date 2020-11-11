package com.heraizen.cj.day1;

import java.util.Scanner;

public class Average {
   private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		float person1Weight=sc.nextFloat();
		System.out.println("Enter the weight of the Second person:");
		float person2Weight=sc.nextFloat();
		System.out.println("Enter the weight of the Third person:");
		float person3Weight=sc.nextFloat();
		
		float sum=person1Weight+person2Weight+person3Weight;
		
		System.out.println("The sum of weight of the 3 persons is "+sum +" Kgs and the average weight is"+sum/3+" kgs");

	}

}

