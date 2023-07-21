package com.array;

public class CopyArrayElement {
	public static void main(String[] args) {
		int a[] = { 21, 34, 23, 12 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];

		}
		System.out.println("Old Element...");
		for (int j : a) {
			System.out.println(j + " ");

		}
		System.out.println();
		System.out.println("Copy Element...");
		for (int k : b) {
			System.out.println(k + " ");

		}
	}
}
