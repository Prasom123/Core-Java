package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        patternType(n);
        sc.close();
	}
	static void patternType(int n) {
		int num=n;
		int a=1;
		for(int i=1;i<=num;i++) {
			
			for(int j=1 ; j<=i*2-1 ; j++ ) {
				System.out.print(a+" ");
				
				 if(j>=i) {
					 a--;
				 }
				 else {
					 a++;
				 }
			}
			System.out.println();
			a=1;
		}
	}
}
