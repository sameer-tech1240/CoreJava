package com.basic;

public class World {
	public static void main(String[] args) {
		/*
		 * if (false) System.out.print("");
		 * 
		 * 
		 * else { System.out.println("💕💕😁😊👍☹️😭🙄😢😘😉🤬🤣");
		 */
		int[] a = { 0, 2, 4, 1, 3 };

		for (int i = 0; i < a.length; i++) {
			a[i] = a[(a[i] + 3) % a.length];
			System.out.println(a[i]);

		}
	}
}
