package com.oops;

abstract class Gander{
	private void type() {
		System.out.println("type is male");
	}
	void show() {
		type();
	}
}
public class Main extends Gander{
public static void main(String[] args) {
	Main main = new Main();
	main.show();
}
}
