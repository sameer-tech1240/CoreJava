package com.basic;

public class SwapTwoNumberInDiffrentWay {
	public static void main(String[] args) {
		int number = 10; 
		int number1 = 20 ; 
		
		System.out.println("Before swaping values :" + number + " " + number1);
		number = number^number1;
		number1 = number^number1;
		number = number^number1;
		
		System.out.println("After swaping values :" + number + " " + number1);
	}

}
