package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInTwoSet {
	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>(Set.of(1, 2, 3, 4, 5));

		Set<Integer> hashSet1 = new HashSet<>(Set.of(6, 7, 8, 95));

		boolean result = Collections.disjoint(hashSet, hashSet1);
		System.out.println(result);

	}

}