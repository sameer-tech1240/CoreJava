package com.string;

public class MinimumOccurUsingForLoop {
	public static void main(String[] args) {
		String string = "Sameer Siddiqui";
		char[] array = string.toCharArray();
		for (int i = 0; i <= array.length-1; i++) {
			char c = array[i];
			if (string.indexOf(c) == string.lastIndexOf(c)) {
				String occur = String.valueOf(c);
				System.out.println(occur);

			}
		}
	}

}
