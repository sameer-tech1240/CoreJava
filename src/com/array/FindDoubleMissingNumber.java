package com.array;

import java.util.Arrays;

public class FindDoubleMissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 8 };
		int n = a.length + 2;
		boolean[] present = new boolean[n + 1];

		for (int i = 0; i < a.length; i++) {
			present[a[i]] = true;
		}

		int[] newArray = new int[n];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				newArray[index++] = i;
			}
		}

		for (int i = 0; i < a.length; i++) {
			newArray[index++] = a[i];
		}

		Arrays.sort(newArray);
		System.out.println("New Array: " + Arrays.toString(newArray));
	}
}