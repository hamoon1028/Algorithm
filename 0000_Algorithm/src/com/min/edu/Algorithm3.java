package com.min.edu;

import java.util.ArrayList;
import java.util.List;

public class Algorithm3 {

	public int solution(String s) {
		int result = 0;
		List<List<String>> temp = new ArrayList<List<String>>();
		
		for (int i = 0; i <= s.length()-1; i++) {
			List<String> temp2 = new ArrayList<String>();
			if(s.charAt(i)==s.charAt(0)) {
				temp2.add(String.valueOf(s.charAt(i)));
				for (int j = i + 1; j < s.length(); j++) {
		            if (s.charAt(i) != s.charAt(j)) {
		                temp2.add(String.valueOf(s.charAt(j)));
		               
		            } else {
		            	break;
		            }
		        }
				temp.add(temp2);
			}	
		}
		
		for (int i = 0; i < temp.size()-1; i++) {
			for (int j = i+1; j < temp.size(); j++) {
				
				if(!temp.get(i).equals(temp.get(j))) {
					result = s.length();
				} else if(j == temp.size()-1) {
					if(temp.get(0).size()==1) {
						result = 1;
					} else if(temp.size()%2 == 1) {
						result = temp.size();
					} else {
						result = 2;
					}
				} else {
					continue;
				}
			}
		}
		
		return result;
	}
	
}
