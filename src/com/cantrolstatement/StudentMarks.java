package com.cantrolstatement;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("Enter your marks");
			int marks = src.nextInt();
			if (marks >= 90 && marks <= 100) {
				System.out.println("Excelent");
			} else if (marks >= 80 && marks <= 89) {
				System.out.println("very Good");
			} else if (marks >= 70 && marks <= 79) {
				System.out.println("Good");
			} else if (marks >= 50 && marks <= 69) {
				System.out.println("poor");
			} else if (marks == 35) {
				System.out.println("Gandhi ji");

			} else {
				System.out.println("fail");
			}

			System.out.println("Do you want to exit y/n");
			char c = src.next().charAt(0);
			if (c == 'n' | c == 'N') {
				isTrue = false;
				System.out.println("Thank You....");
			}

		}
	}

}
