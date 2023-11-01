package com.basic;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		int sumOfCube=0;
		int a,temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = scanner.nextInt();
		
		
		temp=number;
		while (number > 0) {
			a=number%10;
			sumOfCube += (a * a * a);
            number /= 10;
			
		}
		if (sumOfCube == temp) {
			System.out.println(temp + " is an Armstrong number.");
			
		} else {
			System.out.println(temp + " is not an Armstrong number.");

		}
	}

}
