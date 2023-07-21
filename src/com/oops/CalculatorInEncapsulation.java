package com.oops;

import java.util.Scanner;

class Calculator {
	private int num1;
	private int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int add() {
		return num1 + num2;

	}

	public int multiplly() {
		return num1 * num2;

	}

	public int substraction() {
		return num1 - num2;

	}

	public int divide() {
		return num1 / num2;

	}

}

public class CalculatorInEncapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firse number...");
		int first = sc.nextInt();
		System.out.println("Enter second number...");
		int second = sc.nextInt();
		Calculator c = new Calculator(first, second);
		System.out.println(c.add());
		System.out.println(c.multiplly());
		System.out.println(c.substraction());
		System.out.println(c.divide());
	}

}
