package com.arrays.sort;

public class InsertionSortRecursive {

	public static void sort(int[] arr) {
		sortImpl(arr, arr.length - 1);
	}

	private static void sortImpl(int[] arr, int n) {

		if (n > 0) {
			sortImpl(arr, n-1);
			int key = arr[n];
			int j = n - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
