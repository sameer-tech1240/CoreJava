package com.basic;

interface Student {
	void show();

	void sum();

}

public class CovariantExample implements Student {

	@Override
	public void show() {
		System.out.println("jcnd");
	}

	@Override
	public void sum() {
		System.out.println(10);
	}

	public static void main(String[] args) {
		Student covariantExample = new CovariantExample();
		covariantExample.show();
		covariantExample.sum();
	}

}
