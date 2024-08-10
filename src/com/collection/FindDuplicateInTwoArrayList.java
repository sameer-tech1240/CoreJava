package com.collection;

import java.util.Collections;
import java.util.List;

public class FindDuplicateInTwoArrayList {

	public static void main(String[] args) {

		List<Integer> num1 = List.of(12, 23, 34, 32);

		List<Integer> num2 = List.of(5, 23, 2, 1);

		boolean result = Collections.disjoint(num1, num2);

		System.out.println(result);

	}

}
