package com.heraizen.cj.day5.String_Assignment;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		countVowelContant(str);
		sc.close();
	}

	public static void countVowelContant(String str) {
		int letterCount = 0;
		int spaceCount = 0;
		int digitCount =0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				  letterCount++;
			} else if(ch==' ') {
				spaceCount++;
			}
			else if(ch>=48 && ch<=57) {
				digitCount++;
			}
		}
		System.out.println("Letter Count: "+letterCount);
		System.out.println("Space Count: "+spaceCount);
		System.out.println("Digit Count: "+digitCount);


	}
}
