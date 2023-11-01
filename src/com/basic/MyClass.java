package com.basic;

public class MyClass {
	public static void main(String args[]) {
		int i = 1;
		while (i < 10) {
			if (i == 1 || i == 2) {
				++i;
				continue;

			}

			else {
				i++;
				System.out.println(i);

			}

		}
	}
}