package com.arrays.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		int n = arr.length;
		mergeSortImpl(arr, 0, n-1);
	}
	
	private static void mergeSortImpl(int[] arr, int low, int high) {
		
		if (low < high) {
	
			int mid = (high - low)/2 + low;
			// sort the first half
			mergeSortImpl(arr, low, mid);
			
			//sort the second half
			mergeSortImpl(arr, mid+1, high);
		
			mergeSortedArrays(arr, low, mid, high);
		}
	}

	private static void mergeSortedArrays(int[] arr, int low, int mid, int high) {
		
		int i = low;
		int j = mid+1;
		int k = 0;
		
		int[] result = new int[high-low+1];
		
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			result[k++] = arr[i++]; 
		}
		while (j <= high) {
			result[k++] = arr[j++]; 
		}
		
		// copy the result back into original array 
		
		for (int e: result) {
			arr[low++] = e;
		}
	}
	
}
