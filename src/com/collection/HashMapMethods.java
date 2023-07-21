package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sameer");
		map.put(2, "khan");
		map.put(3, "bakar");
		map.put(4, "shoaib");
		System.out.println(map.get(1));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("shoaib"));
		System.out.println(map.replace(1, "sameer", "Aadil"));
		System.out.println(map.remove(1));
		System.out.println(map.replace(2, "khan", "Siddiqui"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		for (Map.Entry z : map.entrySet()) {
			System.out.println(z.getKey() + " " + z.getValue());
		}
	}

}
