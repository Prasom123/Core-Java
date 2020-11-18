package com.heraizen.cj.day5.String_Assignment;

import java.util.Scanner;

public class searchWord {
public static void main(String[] args) {
	String s ="badal,prasom,java,nanhe,rohit";
    String[]  str= s.split(",");
    System.out.println("Search the string");
    Scanner sc=new Scanner(System.in);
	String sr=sc.nextLine();
	int pos=search(sr, str);
	if(pos>=0) {
	System.out.println("found at position: "+pos);
	}else {
		System.out.println("data is not found");
	}
	
	sc.close();
}
 public static  int search(String sr, String[] str) {
	 int pos=-1;
	 for(int i=0; i<str.length ;i++) {
		  if(str[i].equals(sr)) {
			  pos=i;
			  break;
		  }
	 }
	 return pos;
 }
}
