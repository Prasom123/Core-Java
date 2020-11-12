package com.heraizen.cj.day2;

import java.util.Scanner;

public class VowelConstant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet");
        char ch=sc.next().charAt(0);
        checkVowelOrConstant(ch);
        sc.close();
	}
	static void checkVowelOrConstant(char c) {
		char ch=c;
		switch(ch) {
		case 'a':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'e':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'i':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'o':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'u':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    //check upper case vowel letters
		    case 'A':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'E':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'I':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'O':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'U':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    default:
		    System.out.println(ch+" is a consonant");
		    break;
		}
	}
}
