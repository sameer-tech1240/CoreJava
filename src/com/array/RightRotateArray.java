package com.array;



public class RightRotateArray {
	public static void rotateArray(int[] n) {
		int j = n.length - 1;
		for (int i = 0; i < j; i++) {
			int temp = n[i];
			n[i] = n[j];
			n[j] = temp;

		}
		for (int i = 1; i < n.length; i++) {
			System.out.print(n[i]);
		}

		
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rotateArray(n);
	}
}
