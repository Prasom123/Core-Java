package com.heraizen.cj.day6;

import java.util.Scanner;

public class CurrecyType {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	System.out.println("Enter the country name");
	String name=sc.nextLine();
	Currency obj=CurrencyContainer.getCurrency(name);
	obj.getCurrency();
	sc.close();
}
}
interface Currency{
	void getCurrency();
}
class USA implements Currency{
	public void getCurrency() {
		System.out.println("USA Currency");
	}
}
class India implements Currency{
public void getCurrency() {
	System.out.println("India Currency");
		
	}
}
class UK implements Currency{
  public void getCurrency() {
		System.out.println("UK Currency");
	}
}
class CurrencyContainer{
	
  public static Currency getCurrency(String name)  throws IllegalArgumentException  {
		Currency obj =null;
		if(name.toLowerCase().equals("India".toLowerCase())) {
		obj= new India();
		}
		else if(name.toLowerCase().equals("UK".toLowerCase())) {
		 obj=new UK();
		} else if(name.toLowerCase().equals("USA".toLowerCase())) {
			obj= new USA();
		}
	   return obj;
	}
}