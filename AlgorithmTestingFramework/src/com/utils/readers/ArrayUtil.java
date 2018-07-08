package com.utils.readers;

import java.util.Scanner;

public class ArrayUtil {

	public static int[] readIntArray(int n) {
		int[] arr = new int[n];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter "+n+" Integers");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k=n;
		while (n > 0) {
			arr[k-n] = s.nextInt();
			n --;
		}
		s.close();
		return arr;
	}
	
	public static void displayArray(int[] arr) {
		for (int i=0; i< arr.length; ++i) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static boolean isArraySorted(int[] arr, boolean increasing) {
		for (int i=0; i< arr.length -1; ++i) {
			if (arr[i] > arr[i+1]) {
				if (increasing) 
					return !increasing;
			} else if (arr[i] < arr[i+1]){
				if (!increasing) {
					return increasing;
				}
			}
		
		}
		return true;
	}
	
	public static void swap(int[] arr, int i, int pos) {
		int temp = arr[i];
		arr[i] = arr[pos];
		arr[pos] = temp;
	}

}
