package com.heraizen.cj.day2;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        checkArmStrongNumber(n);
        sc.close();
	}
	static void checkArmStrongNumber(int n) {
		int num=n;
		int sum=0;
		while(num>0) {
			  int temp=num%10;
			  sum=sum+ (temp*temp*temp);
			  num=num/10;
		}
		if(sum==n) {
		System.out.println(+n+" is an Armstrong number ");
		}
		else {
			System.out.println(+n+" is not  an Armstrong number ");
		}
	}
}
