package com.heraizen.cj.day3;

import java.util.Scanner;

public class SumOfArray {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 System.out.println("Enter the element");
	 for(int i=0 ; i<n ; i++) {
		 arr[i]=sc.nextInt();
	 }
	 int sum=0;
	 for(int a:arr) {
		 sum=sum+a;
	 }
	 System.out.println("Sum of element of array: "+ sum);
	 sc.close();
}
 
}
