package com.array;

import java.util.ArrayList;

public class ChangeNumberInArray {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		int[] a = { 0, 1, 0, 0, 0, 1, 10, 1 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				list.add(1);

			} else if (a[i] == 1) {
				list.add(0);

			}
			System.out.print(a[i] + " ");
		}
	}

}
