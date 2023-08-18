package com.basic;

public class ButterflyPattern {
	public static void main(String[] args) {

		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * n - 2 * i - 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2 * n; j++) {
				if (j <= i || j > 2 * n - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	}

	
		