package com.task;

public class PrintTable {
	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int i = (n - 1) / 10 + 1;
			int j = (n - 1) % 10 + 1;
			System.out.println(i + "x" + j + "=" + (i * j));

			if (j == 10) {
				System.out.println();

			}
		}
	}

}
