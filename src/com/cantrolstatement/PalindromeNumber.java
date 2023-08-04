package com.cantrolstatement;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = sc.nextInt();
		int reverse = 0;
		int original = number;
		while (original != 0) {
			int digit = original % 10;
			reverse = reverse * 10 + digit;
			original /= 10;

		}
		if (number == reverse) {
			System.out.println("The given number " + number + " is a Palindrome number");

		} else {
			System.out.println("The given number " + number + " is not a Palindrome number");

		}

	}

}
