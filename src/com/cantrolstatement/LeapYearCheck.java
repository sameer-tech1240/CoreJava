package com.cantrolstatement;

import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year to Check....");
		int year = scanner.nextInt();
		scanner.close();

		String result;
		switch (checkLeapYear(year)) {
		case 0:
			result = "Not a leap year.";
			break;
		case 1:
			result = "Leap year.";
			break;
		default:
			result = "Invalid year.";
		}

		System.out.println(result);
	}

	public static int checkLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

}
