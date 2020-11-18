package com.heraizen.cj.day5.object_concept;

import java.util.Arrays;

public class StudentSubject {
	int id;
	String name;
	int[] submarks;
	
 public static void main(String[] args) {
	 StudentSubject s1=new StudentSubject(1001, "Badal", new int[] {78,45,89,56,78});
	 s1.display();
	 s1.calSum(s1);
}
 StudentSubject(int id, String name, int[] submarks){
	  this.id=id;
	  this.name=name;
	  this.submarks=submarks;
 }
 int getId(){
	 return id;
 }
 String getName() {
	 return name;
 }
 int[] getSubMarks() {
	 return submarks;
 }
 
 void display(){
	  System.out.println(this.getId()+" "+this.getName() + " "+ Arrays.toString(this.getSubMarks()) );
  }
 void calSum(StudentSubject s1) {
	 int[] arr=s1.getSubMarks();
	 int sum=0;
	 for(int a:arr) {
		 sum+=a;
	 }
	 System.out.println("Total Marks: "+sum);
 }
}
