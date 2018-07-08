package com.algorithms.dividenconquer;

public class PowerCalculator {
	
	public static long pow(long x, int n) {
		/*// naive algorithm
		long result = 1;
		for (int i=0; i<n; ++i) {
			result = result * x;
		}
		return result;*/
		
		if (n == 1)
			return x;
		if (n == 0)
			return 1;
		long result;
		if ( n % 2 == 0) {
		  result =  pow(x, n/2);
		  return result * result;
		} else {
			result = pow(x, (n-1)/2) ;
			return result * result * x;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}
}
