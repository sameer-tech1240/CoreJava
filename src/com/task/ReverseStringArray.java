package com.task;

public class ReverseStringArray {
	public static void main(String[] args) {
		String fruits[] = {"Apple" , "Banana" , "CHerry" , "Orange"};
		
		for (String fruit : fruits) {
			String reverseOrder = new StringBuffer(fruit).reverse().toString();
			System.out.println(reverseOrder);
		}

	}

}
