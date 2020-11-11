package com.heraizen.cj.day1;

import java.util.Scanner;

public class SimpleIntrest {

	private static Scanner sc;

	public static void main(String[] args) {
	  sc = new Scanner(System.in);
	  System.out.println("Enter the principal amount: ");
	  float p=sc.nextFloat();
	  System.out.println("Enter the rate of intrest: ");
	  float r=sc.nextFloat();
	  System.out.println("Enter the time (years): ");
	  float t=sc.nextFloat();
     
       SI obj= new SI();
       float simpleIntrest=obj.simpleIntrestCalucalte(p, r, t);
       System.out.println("Simple Intrest is "+simpleIntrest);
	}

}
class SI{
	float p;
	float r;
	float t;
	float si;
	
  float simpleIntrestCalucalte(float p, float r, float t) {
	   this.p=p;
	   this.r=r;
	   this.t=t;
	   si=(p*r*t)/100;
	   
	   return si;
  }
}
