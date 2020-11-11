package com.heraizen.cj.day1;

import java.util.Scanner;
import java.util.regex.*; 

public class Membership {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.nextLine();
		System.out.println("Enter the mobile number");
		String mobileNumber=sc.nextLine();
		if (isValid(mobileNumber))  
		{
	        System.out.println("Valid Number");     
		}
	    else {
	        System.out.println("Invalid Number");
	        System.out.println("Enter the mobile number");
	        mobileNumber=sc.nextLine();
	    }

		System.out.println("Enter the age in year");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("Congratulations "+name+" for your successful registration.");
		}
		else {
			System.out.println("Sorry! You need to be at least 18 years old to get membership");
		}
	}
	public static boolean isValid(String s) 
	{ 
	      
	    Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	   
	    Matcher m = p.matcher(s); 
	    return (m.find() && m.group().equals(s)); 
	} 

}


