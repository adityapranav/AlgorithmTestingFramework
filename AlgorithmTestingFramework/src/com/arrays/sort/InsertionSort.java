package com.arrays.sort;

public class InsertionSort {
	public static void sort(int[] arr, boolean increasing) {
		int n = arr.length;
		
		for(int i=1; i < n; ++i) {
			int key = arr[i];
            int j = i-1;
			while (j >= 0 && ((!increasing) ? arr[j] < key : arr[j] > key)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;			
		}
	}
}
