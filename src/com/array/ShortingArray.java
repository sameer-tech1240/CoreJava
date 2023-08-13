package com.array;

import java.util.Arrays;

public class ShortingArray {
	public static void shortArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

	public static void main(String[] args) {
		int n[] = { 8, 4, 3, 1, 7, 6, 5, 2 };
		shortArray(n);
	}
}
