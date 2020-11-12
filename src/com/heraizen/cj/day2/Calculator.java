package com.heraizen.cj.day2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Operand num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Operand num2:");
        int num2=sc.nextInt();
        System.out.println("1. add 2. mul 3. div 4. mod 5. Sub\r\n" + 
                          "Enter the operator");
        int operator=sc.nextInt();
        calculator(num1,num2, operator);
        sc.close();
	}
	static void calculator(int num1, int num2 , int operator) {
		switch(operator) {
		   case 1:
		    System.out.println("Sum of two numbers "+(num1+num2));
		    break;
		   case 2:
			   System.out.println("Multiplication of two numbers "+(num1*num2));
			    break;
		   case 3:
			   System.out.println("Division of two numbers "+(num1/num2));
			    break;
		   case 4:
			   System.out.println("Mod of two numbers "+(num1%num2));
			    break;
		   case 5:
			   System.out.println("Substration of two numbers "+(num1-num2));
			    break;
		   
		    default:
		    System.out.println("invalid operator");
		    break;
		}
	}
}
