package com.min.edu;

public class Algorithm1 {

	public int solution(int n) {
		int result = n;
		
		while (true) {
			int junggan = 0;
			String resultStr = Integer.toString(result);
			
			for (int i = 0; i < resultStr.length(); i++) {
				junggan += Integer.parseInt(String.valueOf(resultStr.charAt(i)));
			}
			
			result = junggan;
			
			if (junggan < 10) {
				break;
			} 
		}
		
		return result;
	}
	
	public int solution2(int n) {
		 while (n >= 10) {
		        int sum = 0;
		        while (n > 0) {
		            sum += n % 10; // 현재 자릿수의 숫자를 더함
		            n /= 10; // 다음 자릿수로 이동
		        }
		        n = sum; // 다음 더해진 값을 n으로 갱신
		    }
		    return n; // 한 자릿수 반환
	}
	
	
}
