package com.constructor;

public class ConstructorChainingUsingThisKeyword {

	public ConstructorChainingUsingThisKeyword() {
		this(123);
		System.out.println("default Constructor...");
	}

	public ConstructorChainingUsingThisKeyword(int a) {
		this("sameer");
		System.out.println("param Constructor...");
		System.out.println("called to default Constructor...");
	}

	public ConstructorChainingUsingThisKeyword(String s) {
		System.out.println("param Constructor2...");
	}

	public static void main(String[] args) {
		ConstructorChainingUsingThisKeyword c = new ConstructorChainingUsingThisKeyword();
	}

}
