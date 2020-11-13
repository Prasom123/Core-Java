package com.heraizen.cj.day3;

public class ArraysMethod {

	public static int biggest(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
			
		}
		return max;
	}
	public static int smallest(int[] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min=arr[i];
			}
			
		}
		return min;
	}
	public static int search(int[] arr , int ele) {
		int pos=-1;
		for(int i=0 ; i<arr.length; i++) {
			if(ele==arr[i]) {
				pos=i;
				break;
			}
		}
		return pos;
	}
	public static int[] ascendingOrder(int [] arr) {
	
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                     if (arr[j] > arr[j + 1]) {           
                          int t = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = t;
                   }
          }
        }
		
	
		
		
       return arr;
	}
	
	public static int[] descendingOrder(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                     if (arr[j] < arr[j + 1]) {           
                          int t = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = t;
                   }
          }
        }
		return arr;
	}
	
}
