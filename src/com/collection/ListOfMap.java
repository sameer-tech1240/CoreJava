package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListOfMap {

	public static void main(String[] args) {
		List<Map<String, Integer>> listOfMap = new ArrayList<Map<String, Integer>>();

		Map<String, Integer> map = new HashMap<>();
		map.put("id", 101);
		map.put("Customer_id", 102);
		listOfMap.add(map);

		for (Map<String, Integer> map1 : listOfMap) {
			System.out.println(map1);
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		Set<String> keySet = listOfMap.iterator().next().keySet();
		for (String keys : keySet) {
			System.out.println("key set wityh set : " + keys);
		}
		listOfMap.forEach(mapFor -> {
			Set<String> keySet2 = mapFor.keySet();
			for (String string : keySet2) {
				System.out.println("entry set with java 8 : " + string);
			}
		});

		listOfMap.iterator().next().keySet().forEach(System.out::println);

	}

}
