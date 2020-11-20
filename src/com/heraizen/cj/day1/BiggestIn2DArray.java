package com.heraizen.cj.day1;
public class BiggestIn2DArray {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 5, 6, 7 }, { 5, 6, 7 }, { 5, 6, 7 } };
		int big = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (big < arr[i][j])
					big = arr[i][j];
			}
		}
		System.out.println(big);
	}

}