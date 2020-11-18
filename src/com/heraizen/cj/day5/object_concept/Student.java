package com.heraizen.cj.day5.object_concept;

public class Student {
	int id;
	String name;
	String address;
	public static int count;
	{
		count++;
	}
	Student(int id, String name, String address){
		 this.id=id;
		 this.name=name;
		 this.address=address;
	   }
	public static void main(String[] args) {
	    Student s1=new Student(1001, "Badal","Begusarai");
		Student s2=new Student(1002, "Prasom","Patna");
		Student s3=new Student(1003, "Nanhe","Begusarai");
		Student s4=new Student(1004, "Rohit","Mumbai");
		Student[] srr= {s1,s2,s3,s4};
		Student.display(srr);
    }
    
  
  public int getId() {
  	return id;
  }
  public String getName() {
  	return name;
  }
  public String getAddress() {
  	return address;
  }
    static void display(Student[] srr) {
    	System.out.println("--------------------------------------------");
    	System.out.format("%-8s%-10s%-20s\n", "ID", "Name", "Address");
    	System.out.println("--------------------------------------------");
		for(Student s:srr) {
			System.out.format("\n%-8d%-10s%-20s\n", s.getId(), s.getName(),
					s.getAddress());
		}
 }
}

