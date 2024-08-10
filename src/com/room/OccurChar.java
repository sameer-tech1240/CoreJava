package com.room;

import java.util.Scanner;

public class OccurChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name....");
		String name = scanner.nextLine();
		System.out.println("Enter a character to check....");
		char c = scanner.next().charAt(0);
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				count++;

			}

		}
		System.out.println(count);
		scanner.close();
	}

}
