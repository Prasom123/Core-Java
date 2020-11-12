package com.heraizen.cj.day2;

import java.util.Scanner;
/***
 * Write a program to accept the marks scored in three subjects; 
 * determine the sum and average of the entered marks. Grade is awarded based on following criteria.
 * @author prasom
 *
 */
public class GradeWise {

	public static void main(String[] args) {
		
		Grade obj=new Grade();
		obj.getGradeResult();
	}

}
class Grade{
	// Using this  method for getting TotalMarks ,Average Marks and Grade
	void getGradeResult() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject:");
		int sub1Score=sc.nextInt();
		System.out.println("Enter the marks scored in 2nd subject:");
		int sub2Score=sc.nextInt();
		System.out.println("Enter the marks scored in 3nd subject:");
		int sub3Score=sc.nextInt();
		int totalMarks=(sub1Score + sub2Score + sub3Score);
		double avg=totalMarks/3;
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average is: "+avg);
		if(avg>60) {
			System.out.println("Grade A");
		}
		else if(avg>35 && avg<=60) {
			System.out.println("Grade B");
		}
		else if(avg>30 && avg<=35) {
			System.out.println("Grade C");
		}
		sc.close();
		
	}
}
