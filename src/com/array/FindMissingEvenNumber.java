package com.array;

public class FindMissingEvenNumber {
	public static void main(String[] args) {
		int a[] = {2,4,6,10};
		int n = a.length + 1;
		int totalsum = (n * (n+1) );
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int missing = totalsum - sum;
		System.out.println("Missing number is : " + missing);
	}

}
