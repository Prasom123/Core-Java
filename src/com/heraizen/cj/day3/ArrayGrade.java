package com.heraizen.cj.day3;

public class ArrayGrade {
 public static void main(String[] args) {
	 int marks[][]=new int[][]{
         {23,45,56,34},
         {45,23,67,78},
         {78, 89,90,80},
         {53,45,78,61}
      };
      for(int i=0 ;i<marks.length; i++) {
    	  int sum= 0;
    	  for(int j=0 ; j<marks[i].length; j++) {
    		  sum +=marks[i][j];
  
    	  }
    	 int  avg=sum/marks[i].length;
    	 String grade =getGrade(avg);
    	 System.out.println("Grade "+grade);
      }
     
}
 public static String getGrade(int avg) {
	  if(avg>=60 && avg<100) {
		  return "A";
	  }
	  else if(avg>=50 && avg<60) {
		  return "B";
	  }
	  else if(avg>=35 && avg<50) {
		  return "C";
	  }
	  else if(avg>=30 && avg<35) {
		  return "Pass";
	  }
	  else {
		   return "Fail";
	  }
 }
}
