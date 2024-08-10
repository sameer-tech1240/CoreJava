package com.string;

import java.util.Scanner;

public class BreakString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = scanner.next();

		if (name.length() % 2 != 0) {

			System.out.println("divide nhi ho rhi hai 50-50 me...");
            System.exit(0);
		}

		int len = name.length() / 2;
		String first = name.substring(0, len);
		String second = name.substring(len);

		System.out.println("First half: " + first);
		System.out.println("Second half: " + second);

		scanner.close();

	}

}
