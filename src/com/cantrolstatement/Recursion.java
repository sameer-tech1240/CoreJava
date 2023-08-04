package com.cantrolstatement;

public class Recursion {
	public static void main(String[] args) {
		Recursion(1);
		
	}
	static void Recursion(int a) {
		if (a>=10) {
			return;
			
		}
		System.out.println("I love you😘");
		Recursion(a+1);
	}

}
