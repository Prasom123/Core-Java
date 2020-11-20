package com.heraizen.cj.day1;

import java.util.Scanner;

public class FiveDigidIncreament1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 5-digit number");
    int n =sc.nextInt();
	int first, second, third, forth;
	int res=0;
	first = (n/10000); 
	res+=(((first+1)%10)*10000);
    n = n%10000;
    second = (n/1000); 
    res+=(((second+1)%10)*1000);
    n = n%1000;
    third = (n/100); 
    res+=(((third+1)%10)*100);
    n = n%100;
    forth = (n/10); 
    res+=(((forth+1)%10)*10);
    n = n%10;
    res+=(n+1)%10;
    System.out.println(res);
    sc.close();
}
}