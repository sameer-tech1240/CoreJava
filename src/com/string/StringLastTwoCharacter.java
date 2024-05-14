package com.string;

import java.util.Scanner;

public class StringLastTwoCharacter {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your name....");
	String name = scanner.nextLine();
	String finalout = name.substring(name.length()-2);
	System.out.println(finalout);
	scanner.close();
	}

	
}
