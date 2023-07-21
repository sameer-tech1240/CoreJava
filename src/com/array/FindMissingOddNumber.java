package com.array;

public class FindMissingOddNumber {
public static void main(String[] args) {
	int a[] = {1,3,7,9,11};
	int n = a.length + 1;
	int totalsum = (n * (n) );
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum += a[i];
	}
	int missing = totalsum - sum;
	System.out.println("Missing number is : " + missing);
}
}

