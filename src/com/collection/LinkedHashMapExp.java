package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExp {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "dog");
		map.put(2, "cat");
		map.put(3, "mouse");
		map.put(4, "cow");

		System.out.println(map);
		Set set = map.entrySet();
		System.out.println(set);

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

		}
	}

}
