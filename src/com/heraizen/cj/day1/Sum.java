package com.heraizen.cj.day1;

import java.util.Scanner;

public class Sum {

	private static Scanner sc;

	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 System.out.printf("Enter First Number =");
			int num1=sc.nextInt();
			 System.out.printf("Enter Second Number =");
			int num2=sc.nextInt();
 	        int result;
	       Test1 obj=new Test1();
	      result=obj.sumOfNumber(num1, num2);
	   System.out.println("Sum of Two Numbers="+result);
	}

}
class  Test1{

	 int sumOfNumber(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
}