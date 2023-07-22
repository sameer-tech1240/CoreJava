package com.string;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurCharacter {

	public static void main(String[] args) {
		
		String name = "sahiljamal";
		int max = Integer.MIN_VALUE;
		Map<Character,Integer> map = new HashMap<>();
		for(char c : name.toCharArray()) {
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, ++count);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) > max) {
				max = map.get(c);
			}
		}
		
		for(char c : map.keySet()) {
			if(max == map.get(c)) {
				System.out.println("Charecter : " + c + " value : " + map.get(c));
			}
		}
		
	}
	
}
