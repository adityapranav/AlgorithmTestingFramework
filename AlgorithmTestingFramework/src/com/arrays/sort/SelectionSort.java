package com.arrays.sort;

import com.utils.readers.ArrayUtil;

public class SelectionSort {
	public static void sort(int[] arr) {
		int n = arr.length;

		int k = 0;
		for (int j = 0; j < n - 1; ++j) {
			int pos = findMin(arr, j, n - 1);
			ArrayUtil.swap(arr, k, pos);
			k++;
		}

	}

	private static int findMin(int[] arr, int j, int i) {
		int smallestIndex = j;
		int min = arr[j];

		for (int x = j + 1; x <= i; ++x) {
			if (arr[x] < min) {
				smallestIndex = x;
				min = arr[x];
			}
		}
		return smallestIndex;
	}
}
