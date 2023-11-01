package com.cantrolstatement;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c + " ");

			int j = 0;
			int k = 1;
			int m = 0;
			for (int l = 1; l < 10; l++) {
				m = j + k;
				j = k;
				k = m;
				System.out.println(m);

			}

		}
	}
}
