package com.unittests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.arrays.sort.InsertionSort;
import com.arrays.sort.InsertionSortRecursive;
import com.utils.readers.ArrayUtil;

public class InsertionSortTest extends BaseSortingTest {

	//@Test
	void insertionSortTest() {
	
		int[] arr = ArrayUtil.readIntArray(10);
		System.out.println("Array before performing Insertion Sort");
		ArrayUtil.displayArray(arr);
		
		long startTime = System.nanoTime();
		InsertionSort.sort(arr, false);
		long endTime = System.nanoTime();
		System.out.println("Array after performing Insertion Sort");
		ArrayUtil.displayArray(arr);
		
		System.out.println("Time taken to perform the operation "+ ( (endTime - startTime) /1000 )+" milliseconds");
		assertTrue(ArrayUtil.isArraySorted(arr, NON_INCREASING));
	}
	
	@Test
	void insertionSortRecursiveTest() {
		int[] arr = ArrayUtil.readIntArray(10);
		System.out.println("Array before performing recursive Insertion Sort");
		ArrayUtil.displayArray(arr);
		
		long startTime = System.nanoTime();
		InsertionSortRecursive.sort(arr);
		long endTime = System.nanoTime();
		System.out.println("Array after performing recursive Insertion Sort");
		ArrayUtil.displayArray(arr);
		
		System.out.println("Time taken to perform the operation "+ ( (endTime - startTime) /1000 )+" milliseconds");
		assertTrue(ArrayUtil.isArraySorted(arr, NON_INCREASING));
	}
}
