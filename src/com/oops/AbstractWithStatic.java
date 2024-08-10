package com.oops;

abstract class Marker {
	{
		System.out.println("hello instance 1.0");
	}

	static {
		System.out.println("hello static 1.0");
	}

	void make() {
		System.out.println("we are making dinner...");
	}

	abstract void getMarker();

}

public class AbstractWithStatic extends Marker {
	{
		System.out.println("hello instance 1.1");
	}

	static {
		System.out.println("hello static 1.1");
	}

	@Override
	void getMarker() {
		System.out.println("hello 1.1");

	}

	public static void main(String[] args) {
		AbstractWithStatic abstractWithStatic = new AbstractWithStatic();
		abstractWithStatic.make();
		abstractWithStatic.getMarker();
	}

}
