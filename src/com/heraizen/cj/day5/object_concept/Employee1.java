package com.heraizen.cj.day5.object_concept;

public class Employee1 {
	int eid;
	String ename;
	double salary=2000;
	
public static void main(String[] args) {
	display();
}

int getId() {
	return eid;
}
String getName() {
	return ename;
}
double getSalary() {
	return salary;
}
Employee1(int eid,String ename){
	this.eid=eid;
	this.ename=ename;
}
Employee1(int id,String ename,float salary){
	this.eid=id;
	this.ename=ename;
	this.salary=salary;
}

static Employee1[] getSeedData(){
	Employee1 emp1=new Employee1(1001,"Badal");
	Employee1 emp2=new Employee1(1002, "Prasom", 5000);
return new Employee1[] {emp1,emp2};
}
 static  void display() {
	Employee1[] earr=Employee1.getSeedData();
	System.out.println("ID"+" \t"+"Name"+ "\t " +"Salary");
	System.out.println("------------------------------------------");
	for(Employee1 e:earr) {
		System.out.println(e.toString());
	}
}
 @Override
 public String toString() {
     return this.getId()+"\t"+this.getName()+"\t"+this.getSalary();
     
 }
}
