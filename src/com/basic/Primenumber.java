package com.basic;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number to check prime or not....");
		int number = scanner.nextInt();
		boolean f = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				f = true;
				 break;

			}
		}
		if (!f) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");

		}
	}

}
