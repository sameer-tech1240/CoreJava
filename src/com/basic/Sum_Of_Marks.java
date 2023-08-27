package com.basic;

import java.util.Scanner;

public class Sum_Of_Marks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter marks for subject 1: ");
		int subject1Marks = scanner.nextInt();

		System.out.print("Enter marks for subject 2: ");
		int subject2Marks = scanner.nextInt();

		System.out.print("Enter marks for subject 3: ");
		int subject3Marks = scanner.nextInt();

		int totalMarks = subject1Marks + subject2Marks + subject3Marks;
		System.out.println("Total marks: " + totalMarks);

	}

}
