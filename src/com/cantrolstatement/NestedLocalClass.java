package com.cantrolstatement;

public class NestedLocalClass {
	void show() {
		System.out.println("hii");
		class NestedLocalClass1{
		void show1() {
				System.out.println("byy");
			}
		}
		NestedLocalClass1 n = new NestedLocalClass1();
		n.show1();
	}
	public static void main(String[] args) {
		NestedLocalClass nes = new NestedLocalClass();
		nes.show();
	}

}
