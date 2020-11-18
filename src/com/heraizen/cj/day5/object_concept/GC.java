package com.heraizen.cj.day5.object_concept;

import java.util.Scanner;

public class GC {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	int result=GCD(num1,num2);
	System.out.println("GCD of two numbers: "+result);
	sc.close();
}
static int GCD(int num1, int num2) {
	if(num1==0) {
		return num2;
	} else if(num2==0) {
		return num1;
	} else if(num1==num2) {
		return num1;
	}
	else if(num1>num2) {
		return GCD(num1-num2, num2);
	} else {
		return GCD(num2-num1, num1);
	}
	
}
}
