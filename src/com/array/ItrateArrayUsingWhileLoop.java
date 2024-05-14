package com.array;

public class ItrateArrayUsingWhileLoop {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int i = 0;

		// Using while loop
		while (i < a.length) {
			System.out.println(a[i]);
			i++;

		}
		// Using do while loop
		do {
			System.out.println(a[i]);
			i++;
		} while (i < a.length);
	}

}
