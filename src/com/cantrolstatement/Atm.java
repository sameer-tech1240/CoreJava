package com.cantrolstatement;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		final int amount = 1500;
		final int pincode = 2881;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount...");
		int amount1 = sc.nextInt();
		System.out.println("Enter your pincode...");
		int pincode1 = sc.nextInt();
		if (amount1 >= 1500) {
			if (pincode1 == 2881) {
				System.out.println("successful withdraw...");
				System.out.println("thank you...");

			} else {
				System.out.println("wrong pin...");
			}

		} else {
			System.out.println("low Amount...");
		}
	}

}
