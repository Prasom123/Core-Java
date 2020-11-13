package com.heraizen.cj.day3;

import java.util.Scanner;

public class ArrayProgram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int[] arr=new int[5];
	    int i=0;
	    System.out.println("Enter the 5 element from 1 to 50");
	    while(i<5) {
	    	int num=sc.nextInt();
	    	if(num>=1 && num<=50) {
	    	 arr[i]=num;
	    	 i=i+1;
	    	} 
	    
	    }
	    System.out.println("Search the element of an array in range 1 to 50");
	      int ele=sc.nextInt();
	      boolean flag=false;
	      if(ele>=1 && ele<=50) {
	      for(int a:arr) {
	    	  if(ele==a) {
	    		  flag=true;
	    	  }
	      }
	      if(flag) {
	    	  System.out.println("Success");
	      } else {
	    	  System.out.println("fail");
	      }
	      }
	      else {
	    	  System.out.println("Please enter range from 1 to  50");
	      }
	      
	      
       sc.close();
	}

}
