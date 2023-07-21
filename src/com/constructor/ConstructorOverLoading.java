package com.constructor;

public class ConstructorOverLoading {
	int id;
	String name;
	public ConstructorOverLoading(int id) {
		
		this.id = id;
		
	}
	public ConstructorOverLoading(int id , String name) {
		this.id=id;
		this.name=name;
	}
	void show() {
		System.out.println("Student Id : " + id + "\nStudent Name : " + name);
	}
	public static void main(String[] args) {
		ConstructorOverLoading c = new ConstructorOverLoading(101,"Sameer");
		c.show();
	}

}
