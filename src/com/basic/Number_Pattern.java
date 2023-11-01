package com.basic;

public class Number_Pattern {
public static void main(String[] args) {
	int n = 5;

	for (int i = 1; i <= n * 2; i++) {
		int col = i >= n ? n * 2 - i : i;
		for (int j = 1; j <= col; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}

}
}
