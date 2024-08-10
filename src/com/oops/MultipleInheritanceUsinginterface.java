package com.oops;

interface Driver {
	void show();
}

interface Base {
	void show();
}

public class MultipleInheritanceUsinginterface implements Driver, Base {

	@Override
	public void show() {
		System.err.println("hello");

	}

	public static void main(String[] args) {
		MultipleInheritanceUsinginterface m = new MultipleInheritanceUsinginterface();
		m.show();
	}

}
