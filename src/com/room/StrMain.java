package com.room;

interface I {
	void sum();
}

public class StrMain {
	public static void main(String[] args) {
		I i = () -> System.out.println("hello");
		i.sum();
	}

}
