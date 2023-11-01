package com.basic;

public class Print_Star_In_Array {
	public static void main(String[] args) {
		
		int row = 5;
		@SuppressWarnings("unused")
		char[][] pattern = new char[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				pattern[i][j] = ' ';

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				pattern[i][j] = '*';

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(pattern[i][j] + " ");

			}
			System.out.println();

		}
	}

}
