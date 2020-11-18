package com.heraizen.cj.day5.String_Assignment;

import java.util.Scanner;

public class CountVowelConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		countVowelContant(str);
		sc.close();
	}

	public static void countVowelContant(String str) {
		int vowelCount = 0;
		int constantCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				switch (ch) {
				case 'a':
					vowelCount++;
					break;
				case 'e':
					vowelCount++;
					break;
				case 'i':
					vowelCount++;
					break;
				case 'o':
					vowelCount++;
					break;
				case 'u':
					vowelCount++;
					break;
				case 'A':
					vowelCount++;
					break;
				case 'E':
					vowelCount++;
					break;
				case 'I':
					vowelCount++;
					break;
				case 'O':
					vowelCount++;
					break;
				case 'U':
					vowelCount++;
					break;
					
				default:
					constantCount++;
					break;
				}
			}
		}
		System.out.println("Vowel Count: "+vowelCount);
		System.out.println("Contant Count: "+constantCount);

	}
}
