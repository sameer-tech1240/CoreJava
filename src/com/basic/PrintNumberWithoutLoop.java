package com.basic;

public class PrintNumberWithoutLoop {
	public static int i = 1;

	public static void printMethod() {
		if (i > 10) {
			return;
		}
		System.out.println(i);
		i++;
		printMethod();
	}

	public static void main(String[] args) {
		printMethod();
	}
}