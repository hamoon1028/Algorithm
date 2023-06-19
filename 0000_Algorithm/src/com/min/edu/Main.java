package com.min.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		Algorithm2 al2 = new Algorithm2();
//		int[] arr = {20,5,7,3,9,13};
//		int n = 25;
//		System.out.println(al2.solution(arr, n));
//		System.out.println(al2.solution2(arr, n));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Algorithm3 al3 = new Algorithm3();
//		int b = al3.solution("aaaa");
//		System.out.println(b);
	

//		Algorithm4 al4 = new Algorithm4();
//		int[] a = {1,2};
//		int[] b = {3,3};
//		int rs = al4.solution1(a, b);
//		System.out.println(rs);

//		Algorithm4 al4 = new Algorithm4();
//		int[] a = {1,2,7};
//		int[] b = {3,2,2,1,5};
//		int rs = al4.solution(a, b);
//		System.out.println(rs);
		
		Algorithm_psn al = new Algorithm_psn();
//		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//		String[] callings = {"kai", "kai", "mine", "mine"};
//		String[] as = al.solution(players, callings);
//		System.out.println(Arrays.toString(as));
		
		String[] name = {"may", "kein", "kain", "radi"}; 
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
//		int[] a = al.solution2(name, yearning, photo);
//		System.out.println(Arrays.toString(a));
		al.solution2(name, yearning, photo);

	}		
}
