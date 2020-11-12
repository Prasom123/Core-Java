package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        patternType(n);
        sc.close();
	}
	static void patternType(int n) {
		int num=n;
		int a;
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1 ; j<=num ; j++ ) {
				if(i==j) {
					a=19;
				}else {
					a=0;
				}
				
				System.out.print(a+" ");
				
			}
			System.out.println();
			
		}
	}
}
