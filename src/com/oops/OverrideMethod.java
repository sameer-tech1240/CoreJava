package com.oops;
class A {
	A() {
		System.out.println("a");
	}
	void a1() {
		System.out.println("a1");
	}
}
class B extends A {
	B() {
		System.out.println("B");

	}
	void b1() {
		System.out.println("B1");
	}
	void a1() {
		System.out.println("A1");
	}
}
public class OverrideMethod {
	public static void main(String[] args) {
		A a = new B();
		a.a1();
	}
}
