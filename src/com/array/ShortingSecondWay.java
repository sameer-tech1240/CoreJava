package com.array;

public class ShortingSecondWay {
	public static void main(String[] args) {
		int a[] = { 43, 23, 12, 54, 65, 87, 34, 21 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.print(a[i] + " ");
		}
	}

}
