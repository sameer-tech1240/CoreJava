package com.string;

public class SwapString {
	public static void main(String[] args) {
		//SwapString swapString = new SwapString();

		String name = "sameer";
		String lname = "aadil";
		System.out.println("Before Swapping...");
		System.out.println(name);
		System.out.println(lname);

		name = name + lname;
		lname = name.substring(0, name.length() - lname.length());
		name = name.substring(lname.length());
		System.out.println("After Swapping...");
		System.out.println(name);
		System.out.println(lname);

	}

}
