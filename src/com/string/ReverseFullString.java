package com.string;

public class ReverseFullString {
	public static void main(String[] args) {
		String str = "I am working right now";
		String s[] = str.split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]+" ");
		}
		

	}

}
