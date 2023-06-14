package com.min.edu;

import java.util.Arrays;

public class Algorithm4 {

	public int solution(int[] a, int[] b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			while(b[i] <= a[j] && i < b.length ) {
				if(a[j]==b[i]) {
					return a[j];
				}
				i++;
			}
		}
		return -1;
	}
	
	public int solution1(int[] a, int[] b) {
		int result = -1;
		
		Arrays.sort(a);

			for (int i = 0; i < b.length; i++) {
				if(Arrays.binarySearch(a, b[i])>=0) {
					return b[i];
				}
			}
		
		return result;
	}
	
}
