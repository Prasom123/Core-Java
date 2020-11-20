package com.heraizen.cj.day7.calculation;

import java.util.Scanner;

public class Calculator {
	int a;
	int b;

	public static void main(String[] args) {
		Calculator.calculation();
	}

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	static void calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the first number");
		int b = sc.nextInt();
		Calculator obj = new Calculator(a, b);

		do {
			System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Sum of two number: " + obj.add());
				break;
			case 2:
				System.out.println("Subraction of two number: " + obj.sub());
			
				break;
			case 3:
				System.out.println("Multiplication of two number: " + obj.mul());
				
				break;
			case 4:
				 obj.div();
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			default :
				throw new IllegalStateException("You are not selected any valid choice");
			}
		} while (true);
	}

	double add() {
		return a + b;
	}

	double sub() {
		return a - b;
	}

	double mul() {
		return a * b;
	}

	void div() {
		double result = 0;
		try {
			result = a / b;
			System.out.println("Divison of two number: "+result);
		} catch (ArithmeticException e) {
			System.out.println(" division by zero is\r\n" + 
					"undefined");
		}
		
	}
}
