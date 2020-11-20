package com.heraizen.cj.day6.currency;

import java.util.Scanner;

public class CurrecyType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name");
		String name = sc.nextLine();
		Currency obj = CurrencyContainer.getCurrency(name);
		obj.getCurrency();
		sc.close();
	}
}