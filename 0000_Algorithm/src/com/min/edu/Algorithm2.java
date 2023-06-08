package com.min.edu;

import java.util.Arrays;
import java.util.HashSet;

public class Algorithm2 {

	public boolean solution(int[]arr, int n) {		
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			int a = n - num;
			if(set.contains(a)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
	
	public boolean solution2(int[]arr, int n) {		
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		
		while (left<right) {
			int sum = arr[left] + arr[right];
			if (sum == n) {
				return true;
			} else if(sum < n) {
				left++;
			} else {
				right--;
			}
			
		}
		
		return false;
	}
	
	
}
