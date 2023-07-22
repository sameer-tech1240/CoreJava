package com.constructor;

class Parameterized {
	int id;
	String name;

	public Parameterized(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class Parameterized_Constructor extends Parameterized {

	public Parameterized_Constructor(int id, String name) {
		super(id, name);

	}

	void print() {
		System.out.println("Id : " + id + "\nName : " + name);
	}

	public static void main(String[] args) {
		Parameterized_Constructor parameterized_Constructor = new Parameterized_Constructor(101, "sameer");
		parameterized_Constructor.print();
	}

}
