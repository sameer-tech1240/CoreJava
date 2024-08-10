package com.task;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		int result = multiply(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result);
		scanner.close();
	}

	public static int multiply(int a, int b) {
		int result = 0;
		for (int i = 0; i < b; i++) {
			result += a;
		}
		return result;
	}
}
