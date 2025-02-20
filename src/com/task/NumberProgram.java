package com.task;

import java.util.Scanner;

class NumberException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NumberException(String message) {
		super(message);
	}
}

public class NumberProgram {

	public static int calculateFirstLastSum(int number) throws NumberException {
		if (number == 0) {
			throw new NumberException("Number is zero");
		}
		int lastDigit = number % 10;
		int firstDigit = number;

		while (firstDigit >= 10) {
			firstDigit /= 10;
		}

		return firstDigit + lastDigit;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int result = calculateFirstLastSum(number);
		System.out.println("Sum of first and last digit: " + result);

		scanner.close();

	}

}
