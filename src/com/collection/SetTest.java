package com.collection;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("sameer");
		set.add("aadil");
		set.add("faiz");
		set.add(null);
		set.add("shoaib");

		System.out.println(set);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
