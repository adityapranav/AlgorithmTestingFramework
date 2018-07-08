package com.algorithms.greedy;

public class ActivitySelection {
	public static void selectActivities(int[] start, int[] finish) {
		int i=0;
		int lastSelected = i; 
		System.out.println("Activity Selected :"+ i);
		
		for(i=1; i<start.length; ++i) {
			if (start[i] >= finish[lastSelected]) {
				System.out.println("Activity Selected :"+ i);
				lastSelected = i;
			}
		}
	}
	public static void main(String[] args) {

	     int start[]  =  {10, 12, 20};
	     int finish[] =  {20, 25, 30};
		sortActivitiesBasedOnFinishTimes(start, finish);
		selectActivities(start, finish);
	}
	private static void sortActivitiesBasedOnFinishTimes(int[] start, int[] finish) {
		
		for (int i=1; i<start.length; ++i) {
			int key = finish[i];
			int skey = start[i];
			int j = i-1;
			while ( j >=0 && finish[j] > key) {
				finish[j+1] = finish[j];
				start[j+1]  = start[j];
			}
			finish[j+1] = key;
			start[j+1]  = skey;
		}
	}
	
	
	
}
