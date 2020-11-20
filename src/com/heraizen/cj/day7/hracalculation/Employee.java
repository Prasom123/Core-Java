package com.heraizen.cj.day7.hracalculation;

public class Employee {
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
    
	public static void main(String[] args) {
		Employee emp = new Employee(1001,"Badal", "Manager", 1000);
		emp.calculateHRA();

	}

	Employee(int empId, String empName, String designation,  double basic, double hra) {
	this.empId = empId;
	     this.empName=empName;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
	}
	int getEmpId() {
		return this.empId;
	}
	String getEmpName() {
		return this.empName;
	}
	String getDesignation() {
		return this.designation;
	}
	double getBasicSalary() {
		return this.basic;
	}
	
	double getHRA() {
		return this.hra;
	}
	
	
	void getHRA(int hra) {
	  this.hra=hra;
	}

	Employee(int empId,String empName, String designation, double basic) {
		this.empId = empId;
		this.empName=empName;
		this.designation = designation;
		this.basic = basic;
		
	}

	void printDET() {
		
		System.out.println("Emp Id: "+getEmpId() + " Employee Name: "+getEmpName() + 
				" Designation: "+getDesignation() + " Basic Salary: "+getBasicSalary() + " Hra Salary: "+getHRA());
		
	}

	void calculateHRA() {
		if(this.getBasicSalary()>=500) {
		if (designation.equalsIgnoreCase("Manager")) {
			hra = 0.1 * basic;
		} else if (designation.equalsIgnoreCase("Officer")) {
			hra = 0.12 * basic;
		} else if (designation.equalsIgnoreCase("CLERK")) {
			hra = 0.05 * basic;
		}
		}
		else {
			throw new LowSalException("Basic Salary must be grater than 500");
		}
		Employee emp1 = new Employee(empId,empName, designation, basic, hra);
		emp1.printDET();
	}
}
