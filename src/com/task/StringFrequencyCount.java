package com.task;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequencyCount {

	public static void main(String[] args) {
		String string = "AadilYasirSameer";

		/* 1st way */

		Map<Character, Long> frequencyMap = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(frequencyMap);

		/* 2nd way */
		char[] charArray = string.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}

		}
		System.out.println(hashMap);

		/* 3rd way */
		Map<Character, Integer> frequencyMap1 = new HashMap<>();

		for (char c : string.toCharArray()) {
			frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
		}

		System.out.println(frequencyMap1);

		/* 4th way */
		Map<Character, Long> frequencyMap2 = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(frequencyMap2);

	}

}
