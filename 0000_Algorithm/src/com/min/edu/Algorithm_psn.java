package com.min.edu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm_psn {

	//경주
	public String[] solution(String[] players, String[] callings) {
		
		Map<String, Integer> playerIndexMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < players.length; i++) {
			playerIndexMap.put(players[i], i);
		}

		for (String calling : callings) {
			int i = playerIndexMap.get(calling);
			
			if(i > 0) {
				String temp = players[i-1];
				players[i-1] = players[i];
				players[i] = temp;
				
				playerIndexMap.put(calling, i - 1);
				playerIndexMap.put(players[i], i);
			} 
		}
		return players;
    }
	
	//추억 점수
	public int[] solution2(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
	       Map<String, Integer> score = new HashMap<String, Integer>();
	       for (int i = 0; i < name.length; i++) {
			score.put(name[i], yearning[i]);
	       }
	      
	       for (int i = 0; i < photo.length; i++) {
	    	   int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {
				if(score.containsKey(photo[i][j])) {
					int eachScore = score.get(photo[i][j]);
					sum += eachScore;
				}
			}
			answer[i] = sum;
		}
	       
	       return answer;
	   }
	
	
}
