package com.string;

public class SplitMethod {
	public static void main(String[] args) {
		String statement = "Spring is a lightweight framework";
		String[] split = statement.split("i");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		System.out.println(split[4]);
		System.out.println(statement.split("i").length);
	}

}
