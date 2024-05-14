package com.room;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = null;
		String str1 = "abc";

		System.out.println(str1.equals("abc") | str.equals(null));
	}

}
