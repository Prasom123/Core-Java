package com.heraizen.cj.day3;

import java.util.Arrays;

public class ArrayProgram1 {

	public static void main(String[] args) {
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0};
		int sum=0;
		for(int i=0; i<A.length; i++) {
			if(i<=14) {
			sum=sum+A[i];
			} else {
				break;
			}
		}
		A[14]=sum;
		sum=0;
		for(int i=0; i<A.length; i++) {
			if(i<=15) {
			sum=sum+i;
			} else {
				break;
			}
		}
	   int avg=sum/16;
	   A[15]=avg;
	   int min=A[0]; 
	   for(int i=0 ; i<A.length; i++) {
		   if(i<16) {
		    if(min>A[i]) {
		    	min=A[i];
		    }
		   }
	   }
		
	   A[16]=min;
	   System.out.println(Arrays.toString(A));
	}

}
