package com.room;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
        int a[]=new int[10];
        // displaying element at index 12
        System.out.println(a[12]);
        // another try block
//        try {
//           System.out.println("Division");
//           int res = 100/ 0;
//        }
//        catch (ArithmeticException ex2) {
//           System.out.println("Sorry! Division by zero isn't feasible!");
//        }
//        finally {
//			System.out.println("close");
//		}
     }
     catch (ArrayIndexOutOfBoundsException ex1) {
        System.out.println("ArrayIndexOutOfBoundsException");
     }
	finally {
		//System.out.println("close main");
		try {
			String nameString= null;
			System.out.println(nameString.length());
		} catch (Exception e) {
			System.err.println(e);
		}
	}
  }
}

