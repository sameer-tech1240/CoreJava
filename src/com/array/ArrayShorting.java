package com.array;

import java.util.Arrays;
import java.util.Optional;

public class ArrayShorting {

	public static void main(String[] args) {
		Integer a[] = { 2, 4, 1, 7, 6 };
		Optional<Integer> findFirst = Arrays.asList(a).stream().sorted().skip(1).findFirst();
		System.out.println(findFirst.get());

	}

}
