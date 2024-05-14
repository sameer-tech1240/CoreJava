package com.basic;

import java.util.Arrays;

public class Var {
	public int sum(int a, int b) {
		return a + b;
	}

//	public int sum(int... a) {
//		int x = 0;
//		for (int i : a) {
//			x += i;
//		}
//		return x;
//	}

	public int sum(int... a) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			x += a[i];
		}
		// return Arrays.stream(a).sum();
		return x;
	}

	public static void main(String[] args) {
		
		Var var = new Var();
		System.out.println(var.sum(5, 5, 5, 5, 8, 7, 6));
	}
}
