package com.string;
public class RemoveSpacesFromString {
	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		return output.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("S am   eer Sid d iqui"));
	}
}
