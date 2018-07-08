package com.unittests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.arrays.sort.MergeSort;
import com.utils.readers.ArrayUtil;

public class MergeSortTest extends BaseSortingTest {
	@Test
	void mergeSortTest() {
	
		int[] arr = ArrayUtil.readIntArray(10);
		System.out.println("Array before performing Merge Sort");
		ArrayUtil.displayArray(arr);
	
		long startTime = System.nanoTime();
		MergeSort.sort(arr);
		long endTime = System.nanoTime();
		
		System.out.println("Array after performing Merge Sort");
		ArrayUtil.displayArray(arr);
		
		System.out.println("Time taken to perform the operation "+ ( (endTime - startTime) /1000 )+" milliseconds");
		assertTrue(ArrayUtil.isArraySorted(arr, INCREASING));
	}
}
