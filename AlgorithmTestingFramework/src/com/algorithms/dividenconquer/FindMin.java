package com.algorithms.dividenconquer;

public class FindMin {

	public static int findMin(int[] arr) {
		return minImpl(arr, arr.length-1);
	}
	
	private static int minImpl(int[] arr, int n) {
		if ( n == 0 ) 
			return arr[n];
		else {
			int temp = minImpl(arr, n-1);
			if ( temp < arr[n]) {
				return temp;
			} else {
				return arr[n];
			}
		}
	}
	
	public static int findMinDivide(int[] arr) {
		return minDivideImpl(arr, 0, arr.length-1);
	}
	
	
	private static int minDivideImpl(int[] arr, int l, int h) {
		if (l == h) {
			return arr[l];
		} else {
			int mid = (l+h)/2;
			int x = minDivideImpl(arr, l, mid);
			int y = minDivideImpl(arr, mid+1, h);
			if (x < y) {
				return x;
			} else {
				return y;
			}
		}
	}

	public static void main(String[] args) {
		 int start[]  =  {10, 12, 20, 8, 2};
		 System.out.println(findMinDivide(start));
	}

}
