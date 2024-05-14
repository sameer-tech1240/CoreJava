package com.basic;

/*import java.util.Scanner;*/

public class EvenOdd {
	    public static void main(String[] args) {
	        int rows = 5; 
	        int cols = 2;

	        System.out.println("Even and Odd Numbers Table:");

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= cols; j++) {
	                int number = (i - 1) * cols + j;
	                System.out.print(formatNumber(number) + "\t");
	            }
	            System.out.println();
	        }
	    }

	    private static String formatNumber(int number) {
	        return (number % 2 == 0) ? "" + number : "" + number;
	    }
	}

		
		/*
		 * String s = null; String sr = "Null"; System.out.println(s.equals(sr));
		 * System.out.println(sr.equals(s));
		 */
	


