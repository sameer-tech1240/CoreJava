package com.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "I am working right now";

		String s[] = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i]);
			sb.append(" ");
		}
		
		System.out.println(sb);

	}

}
