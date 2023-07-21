package com.cantrolstatement;

public class SwapTwoVariable {
	public static void main(String[] args) {
		int number = 10;
		int number1 = 15;
		System.out.println("Befour Swapping...");
		System.out.println(number);
		System.out.println(number1);
		number=number+number1;
		number1=number-number1;
		number=number-number1;
		System.out.println("After Swapping...");
		System.out.println(number);
		System.out.println(number1);
	}

}
