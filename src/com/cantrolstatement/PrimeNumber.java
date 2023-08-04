package com.cantrolstatement;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = sc.nextInt();
		for (int i = 2; i <= number; i++) {
			boolean prime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					prime = false;
					break;

				}
			}
			if (prime) {
				System.out.println(i);
			}
				
			

		}
	}
}
