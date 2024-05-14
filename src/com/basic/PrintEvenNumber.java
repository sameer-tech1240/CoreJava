package com.basic;

public class PrintEvenNumber {
	public static void main(String[] args) {
		float f= 4.7333434f;
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println("even : " + i);
		}
	}

}
