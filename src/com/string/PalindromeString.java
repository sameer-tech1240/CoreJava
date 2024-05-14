package com.string;

import java.util.HashSet;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "Mom";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.toLowerCase().equals(rev.toLowerCase())) {

			System.out.println("Given String is palindrome");

		} else {
			System.out.println("Given String is not a palindrome");
		}
		
	}

}
