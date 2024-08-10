package com.basic;

public class Finally {
	public static void main(String[] args) {
		System.out.println(m1());
	}

	public static int m1() {
		try {
			System.out.println("hello");
			return 9;

		} catch (Exception e) {
			System.out.println("hello");
			return 999;

		} finally {

			System.out.println("hello");

		}
	
	
	}

}
