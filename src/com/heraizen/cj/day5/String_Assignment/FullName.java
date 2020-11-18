package com.heraizen.cj.day5.String_Assignment;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first name");
    String firstName=sc.nextLine();
    System.out.println("Enter the middle name");
    String middleName=sc.nextLine();
    System.out.println("Enter the last name");
    String lastName=sc.nextLine();
     getName(firstName, middleName, lastName);
     sc.close();

	}
	public static void getName(String firstName, String middleName, String lastName ) {
		String fullName=firstName+"-"+middleName+"-"+lastName;
		System.out.println("Name"+"-"+fullName);
	}

}
