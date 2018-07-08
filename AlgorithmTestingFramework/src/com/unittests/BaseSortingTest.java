package com.unittests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import com.arrays.sort.InsertionSort;
import com.utils.readers.ArrayUtil;

public abstract class BaseSortingTest {
	
	static final boolean INCREASING = true;
	static final boolean NON_INCREASING = false;
	
	private static ConfigReader configReader = null;
	
	static {
		configReader = new ConfigReader();
	}
	
	//@Test
	void insertionSortConfigData() {
		try {
			SortingInformation info = configReader.readProperties("sortDetails");
			int[] arr = null;
			boolean dataFound = false;
			for(SortingDet d:  info.getSortingDetails() ) {
				if (d.getAlgorithmName().equalsIgnoreCase("insertionsort")) {
					arr = d.getArrayData();
					dataFound = true;
					break;
				}
			}
			if (!dataFound) {
				System.out.println("Skipping the test insertionSortConfigData as there is no data specified in the config file for insertionSort");
				return;
			}
			System.out.println("Array before performing Insertion Sort");
			ArrayUtil.displayArray(arr);
			long startTime = System.nanoTime();
			InsertionSort.sort(arr, false);
			long endTime = System.nanoTime();
			System.out.println("Array after performing Insertion Sort");
			ArrayUtil.displayArray(arr);
			
			System.out.println("Time taken to perform the operation "+ ( (endTime - startTime) /1000 )+" milliseconds");
			assertTrue(ArrayUtil.isArraySorted(arr, NON_INCREASING));
			
		} catch (IOException e) {
			System.out.println("Error while reading the properties file sortDetails.properties. Please check the format/contents.");
			e.printStackTrace();
		}
		
	}

}
