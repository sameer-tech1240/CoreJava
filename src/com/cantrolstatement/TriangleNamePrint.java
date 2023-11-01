package com.cantrolstatement;

public class TriangleNamePrint {

	public static void main(String[] args) {

		String name = "Sameer Siddiqui";
		int length = name.length();

		for (int i = 1; i <= length; i++) {
			for (int j = length - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(name.charAt(k - 1));
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(name.charAt(l - 1));
			}
			System.out.println();
		}

	}
}
