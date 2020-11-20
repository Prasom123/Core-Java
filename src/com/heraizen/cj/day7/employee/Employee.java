package com.heraizen.cj.day7.employee;

import java.util.Scanner;

public class Employee {
	int empNumber;
	String name;
	float exp;

	Employee(int empNumber, String name, float exp) {
		this.empNumber = empNumber;
		this.name = name;
		this.exp = exp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String empName = sc.nextLine();
		
		System.out.println("Enter the employee number");
		int empNumber = sc.nextInt();
		
		System.out.println("Enter the employee experience");
		float exp = sc.nextFloat();
		sc.close();
		if (exp > 2.5 && exp < 3.6) {
			Employee emp = new Employee(empNumber, empName, exp);
			System.out.println(emp.toString());

		} else {
			throw new IllegalArgumentException();
		}
		
		
	}

	@Override
	public String toString() {
		System.out.println(name);
		return "[" + "Employee Number: " + empNumber + "," + "Employee Name: " + name + "," + "Experience: " + exp
				+ "]";
	}

}
