package com.heraizen.cj.day5.object_concept;

public class Employee {
	int eid;
	String ename;
	double salary;
	
public static void main(String[] args) {
	display();
}
// Employee(int eid, String ename, double salary){
//	this.eid=eid;
//	this.ename=ename;
//	this.salary=salary;
//}
int getId() {
	return eid;
}
String getName() {
	return ename;
}
double getSalary() {
	return salary;
}
void setId(int eid) {
	this.eid=eid;
}
void setName(String ename) {
	this.ename=ename;
}
void setSalary(double salary) {
	this.salary=salary;
}
static Employee[] getSeedData(){
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	Employee emp3=new Employee();
	
emp1.setId(1001);
emp1.setName("Badal");
emp1.setSalary(1000000.0);

emp2.setId(1002);
emp2.setName("Prasom");
emp2.setSalary(1000000.0);

emp3.setId(1003);
emp3.setName("Rohit");
emp3.setSalary(1000000.0);
return new Employee[] {emp1,emp2,emp3};
}
 static  void display() {
	Employee[] earr=Employee.getSeedData();
	System.out.println("ID"+" \t"+"Name"+ "\t " +"Salary");
	System.out.println("------------------------------------------");
	for(Employee e:earr) {
		System.out.println(e.toString());
	}
}
 @Override
 public String toString() {
     return this.getId()+"\t"+this.getName()+"\t"+this.getSalary();
     
 }

}
