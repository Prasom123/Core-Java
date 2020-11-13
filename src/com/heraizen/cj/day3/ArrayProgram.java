package com.heraizen.cj.day3;
import static com.heraizen.cj.day3.ArraysMethod.*;
import static com.heraizen.cj.day3.ArraysMethod.search;
import static com.heraizen.cj.day3.ArraysMethod.smallest;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayProgram {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int[] arr= {15,4, 2 ,20,7,56,89,20};
	int big=biggest(arr);
	System.out.println("Biggest Element in Array: "+big);
	int small=smallest(arr);
	System.out.println("Biggest Element in Array: "+small);
	System.out.println("Enter Search the element");
	int ele=sc.nextInt();
	int  pos=search(arr , ele);
	if(pos==-1) {
		System.out.println("Element is not found");
	}else {
		System.out.println("Element is found at position: "+pos);
	}
	 
	int[] sortArray=ascendingOrder(arr );
	System.out.println("Sorting Array In Ascending Order"+ Arrays.toString(sortArray));
	int[] sortArray1=descendingOrder(arr );
	System.out.println("Sorting Array In Ascending Order"+ Arrays.toString(sortArray1));
	sc.close();
}
}

