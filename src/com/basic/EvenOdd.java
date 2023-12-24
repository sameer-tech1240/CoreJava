package com.basic;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int i = scanner.nextInt();
			Object output = (i%2==0)?"even" :"odd";
			System.out.println(output);
			scanner.close();
		}
	
		
		/*
		 * String s = null; String sr = "Null"; System.out.println(s.equals(sr));
		 * System.out.println(sr.equals(s));
		 */
	

}
