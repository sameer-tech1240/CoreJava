package com.basic;

class Main{
	public Main add() {
		System.out.println("hii");
		return this;
	}
	public Main add1() {
		System.out.println("hello");
		return this;
	}
	public void add2() {
		System.out.println("byy");
	}
	
}
public class MultipleMethod {
	public static void main(String[] args) {
		new Main().add().add1().add2();
	}

}
