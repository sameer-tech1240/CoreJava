package com.cantrolstatement;

import java.util.Scanner;

public class ReverseNumberByUsingScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number...");
		int number = sc.nextInt();
		int reverse=0;
		while (number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
			
			
		}
		System.out.println("Reverse Number... " + reverse);
	}
	
	
	

}
