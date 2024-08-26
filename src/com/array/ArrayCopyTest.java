package com.array;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 };
		int[] copy = new int[original.length];
		System.arraycopy(original, 0, copy, 0, original.length);
		System.out.println(Arrays.toString(copy));
	}
}