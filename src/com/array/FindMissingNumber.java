package com.array;

public class FindMissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };
		int n = a.length + 1;
		int totalsum = (n * (n + 1) / 2);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int missing = totalsum - sum;
		System.out.println("Missing number is : " + missing);
	}

}
