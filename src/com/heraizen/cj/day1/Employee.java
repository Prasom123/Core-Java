package com.heraizen.cj.day1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpDetails emp1=new EmpDetails();
        emp1.getEmpDetails();
	}

}
class EmpDetails{
	
	private Scanner sc;

	void getEmpDetails() {
		sc = new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int empNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String empName=sc.nextLine();
		System.out.println("Enter Employee Salary");
		float empSalary=sc.nextFloat();
		System.out.println("Hi"+empName+" !"+ "Your Employee id is "+empNumber +" monthly salary is Rs "+empSalary + " and yearly salary is Rs "+ empSalary*12+" .")
;	}
}
