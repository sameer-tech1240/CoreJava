package com.oops;

class Human {
	void displayHuman() {
		System.out.println("Method Define in side the Human Class");
	}

}

interface Male {
	void male();

}

interface Femail {
	void femail();

}

class Child extends Human implements Male, Femail {

	@Override
	public void male() {
		System.out.println("Implementation of male() method defined in interfaces Male ");

	}

	@Override
	public void femail() {
		System.out.println("Implementation of femail() method defined in interfaces Female");
	}
	
	void child() {
		System.out.println("Method define inside the child class");
	}

}

public class Hybrid_Test {
	public static void main(String[] args) {
		 Child child = new Child();
		 child.child();
		 child.displayHuman();
		 child.male();
		 child.femail();
	}

}
