package com.string;

public class FindDuplicateInStringUsingArray {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int ans = a * b / a - b;
		int ans1 = (a * b) / (a - b);
		System.out.println(ans + "" + ans1);
		String string = "Adil Siddiqui";
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);

				}

			}

		}

		System.out.println("-----------------------------");

		String s = "Sameer";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));

				}

			}

		}
	}

}
