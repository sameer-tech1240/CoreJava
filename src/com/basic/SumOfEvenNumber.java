package com.basic;

public class SumOfEvenNumber {
	static int sum = 0;
	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			if (i%2==0) {
				sum += i;
	
			}
		}
		System.out.println(sum);
	}

}
