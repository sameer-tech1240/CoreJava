package com.basic;

public class Addition {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i+1; j < a.length; j++) {
		 * if (a[i] ==a[j]) {
		 * 
		 * System.out.println(a[i]); }
		 * 
		 * }
		 * 
		 * }
		 */
		int b[] = { 1, 2, 5, 7, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);

				}
			}
		}
	}
}