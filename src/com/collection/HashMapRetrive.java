package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class HashMapRetrive {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "java");
		hm.put(102, "html");
		hm.put(103, "python");
		hm.put(104, "c language");

		System.out.println(hm); //{101=java, 102=html, 103=python, 104=c language}
		Set set = hm.entrySet();//[101=java, 102=html, 103=python, 104=c language]
		System.out.println(set);

		for (Map.Entry em : hm.entrySet()) {
			System.out.println(em.getKey() + " " + em.getValue());

		}
	}

}
