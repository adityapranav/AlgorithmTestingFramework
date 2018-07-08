package com.unittests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.arrays.sort.SelectionSort;
import com.utils.readers.ArrayUtil;

public class SelectionSortTest extends BaseSortingTest {
	@Test
	void selectionSortTest() {
		
		int[] arr = ArrayUtil.readIntArray(10);
		System.out.println("Array before performing Selection Sort");
		ArrayUtil.displayArray(arr);
		
		long startTime = System.nanoTime();
		SelectionSort.sort(arr);
		long endTime = System.nanoTime();
		System.out.println("Array after performing Selection Sort");
		ArrayUtil.displayArray(arr);
		
		System.out.println("Time taken to perform the operation "+ ( (endTime - startTime) /1000 )+" milliseconds");
		assertTrue(ArrayUtil.isArraySorted(arr, INCREASING));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
