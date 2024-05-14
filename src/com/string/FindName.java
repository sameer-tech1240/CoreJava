package com.string;

public class FindName {
	static int count = 0;

	public static void main(String[] args) {
		String of = null;
		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i + " " + i);
		}
		System.out.println("-------------------------------");
		char[] arr = { 115, 97, 109, 101, 101, 114 };
		of = String.valueOf(arr);
		System.out.println("Name is " + of);
		for (char a : of.toCharArray()) {
			if (isVowel(a)) {
				count++;
			}
		}
		System.out.println("Vowel occur " + count + " times");
	}

	public static boolean isVowel(char i) {
		return "aioueAIOUE".indexOf(i) == -1;
	}

}
