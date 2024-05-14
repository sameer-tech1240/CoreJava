package com.string;

public class CountVowelInString {
	public static void main(String[] args) {
		String vowel = "Sameer is good boy";
		String lower = vowel.toLowerCase();
		int count = 0;   
		char[] array = lower.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {

				count++;
			}

		}
		System.out.println("Vowel occur " + count + " in times");
	}

}
