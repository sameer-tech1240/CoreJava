package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ItrateArrayList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(6);
		arrayList.add(8);

//		for(Iterator<Integer> iterator = arrayList.h)

		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(8);

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object next = iterator.next();
			System.out.println(next); // 2 3 5 6 8

		}
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings("unused")
			Integer next = iterator.next();

		}
		arrayList.removeIf(item -> item == 8);
		System.out.println(arrayList); // 2 5 3 6
		
		set.forEach(System.out::println);//2 3 5 6 8
		set.stream().forEach(System.out::println);//2 3 5 6 8


	}

}
