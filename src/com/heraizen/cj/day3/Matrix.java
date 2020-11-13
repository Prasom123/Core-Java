package com.heraizen.cj.day3;

import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row size");
	int m=sc.nextInt();
	System.out.println("Enter the col size");
	int n=sc.nextInt();
	int[][] arr=new int[m][n];
	for(int i=0 ;i<m;i++) {
		System.out.println("Enter the row "+(i+1));
		for(int j=0; j<n ; j++) {
			
			arr[i][j]=sc.nextInt();
		}
	}
	int sum=0;
	for(int i=0 ;i<m;i++) {
		for(int j=0; j<n ; j++) {
		  sum=sum+arr[i][j];
		}
	}
	System.out.println("Sum of Element of Matrix: "+sum);
	int max=arr[0][0];
	for(int i=0 ;i<m;i++) {
		for(int j=0; j<n ; j++) {
		  if(max<arr[i][j]) {
			  max=arr[i][j];
		  }
		}
	}
	System.out.println("Biggest   Element of Matrix: "+max);
	
	int digonalSum=0;
	for(int i=0 ;i<m;i++) {
		for(int j=0; j<n ; j++) {
		  if(i==j) {
			  digonalSum+=arr[i][j];
		  }
		}
	}
	System.out.println("Diagonal Sum of Element of Matrix: "+digonalSum);
	
	 int transpose[][] = new int[n][m];
	 
     for ( int i = 0 ; i< m ; i++ )
     {
        for ( int j = 0 ; j < n ; j++ )               
           transpose[j][i] = arr[i][j];
     }

     System.out.println("Transpose of entered matrix:-");

     for (int i= 0 ; i< n ; i++ )
     {
        for ( int j = 0 ; j < m ; j++ )
              System.out.print(transpose[i][j]+"\t");

        System.out.print("\n");
     }
     sc.close();
}
}
