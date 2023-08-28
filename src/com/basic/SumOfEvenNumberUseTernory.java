package com.basic;

public class SumOfEvenNumberUseTernory {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += (i % 2 == 0) ? i : 0;

		}
		System.out.println(sum);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				i++;
				System.out.println(i);

			}

		}
	}
}

