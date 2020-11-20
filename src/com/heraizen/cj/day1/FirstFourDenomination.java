package com.heraizen.cj.day1;

import java.util.Scanner;

public class FirstFourDenomination {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 4-digit number");
    int n =sc.nextInt();
	int first, second, third, forth;
	first = (n/1000); 
    System.out.println(first+"*"+1000+"="+(first*1000));
    n = n%1000;
    second = (n/100); 
    System.out.println(second+"*"+100+"="+(second*100));
    n = n%100;
    third = (n/10);
    System.out.println(third+"*"+10+"="+(third*10));
    forth = (n%10);   
    System.out.println(forth+"*"+1+"="+(forth*1));
    sc.close();
}
}
