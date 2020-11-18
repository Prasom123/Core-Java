package com.heraizen.cj.day5.object_concept;

import java.util.Scanner;

public class Number {
    Scanner sc=null;
	public static void main(String[] args) {
		Number obj = new Number();
		obj.getChoice();
	}

	void getChoice() {
		this.sc=new Scanner(System.in);
		do {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.Factorial\t2.Table \t3.Prime or not \t 4.exit");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Enter the Choice");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				this.getFactorial();
				break;
			case 2:
				this.getTable();
				break;
			case 3:
				this.checkPrime();
				break;
			case 4:
				System.out.println("Thank you............");
				sc.close();
				System.exit(0);
			}
		} while (true);
	}

	void getFactorial() {
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int res=1;
      for(int i=1; i<=num;i++) {
    	  res*=i;
      }
      System.out.println("Factorial of "+num+" "+res);
      
	}

	void getTable() {
		System.out.println("Enter the number");
	      int num=sc.nextInt();
	      System.out.println("Table of "+num);
	      for(int i=1; i<=10;i++) {
	    	    System.out.println(num*i);
	      }
	      
	      
	}

	void checkPrime() {
		System.out.println("Enter the number");
	      int num=sc.nextInt();
	      boolean flag=true;
	      if(num<=0) {
				System.out.println("Please Enter Positive Number");
			}
			else if(num==2 || num==3) {
				System.out.println("The entered number "+num+ " is a prime number ");
			}
			else if(num>3 ) {
				for(int i=2 ; i<=num/2;i++) {
					if(num%i==0) {
						flag=false;
					}
				}
				if(flag) {
					System.out.println("The entered number "+num+ " is a prime number ");
				}
				else {
					System.out.println("The entered number "+num+ " is not a prime number ");
				}
			}
	      
	}
}
