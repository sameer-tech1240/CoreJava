package com.basic;

public class OverloadingExample {
	int add(int a, int b) {

		return a + b;

	}

	int add(int a, int b, int c) {

		return a + b + c;

	}

	public static void main(String[] args) {
		OverloadingExample overloadingExample = new OverloadingExample();
		int add = overloadingExample.add(1, 20);
		int add2 = overloadingExample.add(1, 20, 30);
		System.out.println(add);
		System.out.println(add2);
	}

}
