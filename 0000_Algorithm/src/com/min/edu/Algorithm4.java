package com.min.edu;

import java.util.Arrays;

public class Algorithm4 {

	public int solution(int[] a, int[] b) {
		int result = -1;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					return a[i];
				}
			}
		}
		
		return result;
		//시간복잡도 O^2
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
		//시간복잡도 O(NlogN)
	}
	
}
