package com.heraizen.cj.day2;

import java.util.Scanner;

public class MemberShipCard {

	public static void main(String[] args) {
		Discounts obj=new Discounts();
		obj.getDiscount();
	}

}

class Discounts{
	 void getDiscount() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the bill amount :");
		 double num=sc.nextInt();
		 System.out.println("Do you have a membership card?");
		 char ch = sc.next().charAt(0); 
		 double result=num;
		 double discount;
		 if(ch=='Y') {
			 discount=num*0.1;
			 result-=discount;
			 System.out.println("Thank you! Your total bill amount is Rs "+num +" , discount is Rs "+discount+ " and net amount payable is Rs "+result +" .");
		 }
		 else if(ch=='N') {
			 discount=num*0.03;
			 result-=discount;
			 System.out.println("Thank you! Your total bill amount is Rs "+num +" , discount is Rs "+discount+ " and net amount payable is Rs "+result +" .");
		 }
		 sc.close();
	 }
}