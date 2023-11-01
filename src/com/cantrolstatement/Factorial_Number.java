package com.cantrolstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial_Number {
	static int number;

	public static void main(String[] args) throws Exception {
		int i, j;
		for (i = 1, j = 10; i < +j; i++, j--) {
			System.out.println(i);
		}
		show(1);

	}

	static void show(int fact) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number......");
		number = Integer.parseInt(bufferedReader.readLine());
		for (int i = 1; i <= number; i++) {
			fact = fact * i;

		}

		System.out.println("Factoril number of " + number + " :- " + fact);

		System.err.println("Do you want to try again press 1 and you want to Exit type any Number.....");

		int try_Again = Integer.parseInt(bufferedReader.readLine());

		if (try_Again == 1) {
			show(fact);
		} else {
			System.out.println("thank you");

		}

	}

}
