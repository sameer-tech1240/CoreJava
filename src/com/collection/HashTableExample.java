package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(1, "Sameer");
		hashtable.put(2, "Sameer");
		hashtable.put(3, "Aadil");
		hashtable.put(4, "Anas");
		hashtable.put(5, "Sahil");
		System.out.println(hashtable.getOrDefault(3, "Find this"));
		
		hashtable.putIfAbsent(7, "Abrar");
		System.out.println(hashtable);

		for (Map.Entry m : hashtable.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
