package com.string;

import java.util.Scanner;

public class OccurCharAtRuntime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name....");
		String name = scanner.nextLine().toLowerCase();
		System.out.println("Enter a character to check....");
		char c = scanner.next().toLowerCase().charAt(0);
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.toLowerCase(name.charAt(i)) == c) {
				count++;
				
			}
		}
		System.out.println("given string " + c + " occur :  " + count + " times....");
		scanner.close();
	}

}
