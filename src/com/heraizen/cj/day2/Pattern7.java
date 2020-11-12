package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        patternType(n);
        sc.close();
	}
	static void patternType(int n) {
		int num=n;
		
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1 ; j<=num ; j++ ) {
				if(i==1) {
				System.out.print("@"+" ");
				}
				else if(i>1 && i<=num && j==1 ) {
					System.out.print("@"+" ");
				}
				else if(i>1 && i<=num && j==num ) {
					System.out.print("@"+" ");
				}
				else if(i==(num/2+1)) {
					System.out.print("@"+" ");
				}
				
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		}
}
