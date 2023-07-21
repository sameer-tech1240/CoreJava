package com.array;

import java.util.Scanner;

public class SunOfArray {

	private static Scanner sc = new Scanner(System.in);

	public static int[] arraySort(int[] a) {
		boolean isTrue = true;
		while (isTrue) {
			isTrue = false;
			int temp = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					a[i + 1] = temp;
					isTrue = true;

				}
			}

		}
		return a;
	}

	public static int[] getArray(int a) {
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter a number.....");
			b[i] = sc.nextInt();
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = getArray(10);
		a = arraySort(a);
		System.out.println("Print Array Element : ");
		for (int d : a) {
			System.err.println(d);

		}

	}
}
