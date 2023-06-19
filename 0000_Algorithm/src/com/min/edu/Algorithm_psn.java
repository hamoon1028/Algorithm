package com.min.edu;

import java.util.Arrays;

public class Algorithm_psn {

	public void solution() {
		String[] players = {"first", "second", "third", "fourth", "fifth"};
		String[] callings = {"fourth", "fourth", "fifth", "fifth"};
		
		String plstr = Arrays.toString(players);
		String clstr = Arrays.toString(callings);
		char[] charply = plstr.toCharArray();
		char[] charclg = clstr.toCharArray();
		
		// callings i번째 : players 몇번째에 있는지 확인 n
		int idx = 0;
		for (int i = 1; i < charply.length; i++) {
			if (charclg[0] == charply[i]) {
				idx = i;
			}
		}
		
//		while (cidx < callings.length) {
//			int cidx = 0;
//			// temp = players [n-1]
//			String temp = players[idx - 1];
//			// players [n-1] = callings[0]
//			players[idx - 1] = callings[cidx];
//		}
		
	
		
	}
	
}
