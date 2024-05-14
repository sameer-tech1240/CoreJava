package com.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		int[][] c[] = { { { 1, 2, 3, 4 }, { 6, 7, 8 }, { 1, 2 } } };
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < c[i][j].length; k++) {

					System.err.print(c[i][j][k]);
				}

			}
		}

		
		Object b[] = new Integer[4];
		b[0] = "ayaz";
		System.out.println(Arrays.toString(b));
	}

}
