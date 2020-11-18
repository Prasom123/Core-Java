package com.heraizen.cj.day5.String_Assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string ");
	 String str=sc.nextLine();
	 System.out.println(str.toUpperCase());
	 System.out.println(str.toLowerCase());
	  isPalindrome(str);
	  sc.close();
	}
	
	public static void isPalindrome(String str) {
		  String rev="";
		  for(int i=str.length()-1; i>=0 ; i--) {
			  rev=rev+str.charAt(i);
		  }
		if(str.toUpperCase().equals(rev.toUpperCase())) {
			System.out.println(rev +" is Palindrome");
		}
		else {
			System.out.println(rev+ " is not Palindrome");
		}
	}

}
