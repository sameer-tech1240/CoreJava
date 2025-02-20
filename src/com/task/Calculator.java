package com.task;

public class Calculator {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator <operation> <num1> <num2>");
			System.out.println("operation: add, subtract, multiply, divide");
			System.exit(1);
		}

		// Parse the operation and numbers
		String operation = args[0].toLowerCase();
		double num1 = Double.parseDouble(args[1]);
		double num2 = Double.parseDouble(args[2]);

		// Perform operation based on user input
		switch (operation) {
		case "add":
			System.out.println("Result: " + (num1 + num2));
			break;
		case "subtract":
			System.out.println("Result: " + (num1 - num2));
			break;
		case "multiply":
			System.out.println("Result: " + (num1 * num2));
			break;
		case "divide":
			if (num2 == 0) {
				System.out.println("Error: Division by zero is not allowed.");
			} else {
				System.out.println("Result: " + (num1 / num2));
			}
			break;
		default:
			System.out.println("Error: Invalid operation. Please use add, subtract, multiply, or divide.");
		}
	}
}

/*
 	
 	running command from terminal 
 	1) cd D:\sts-programs\core_java\src
 	
    2)javac com/task/Calculator.java
    
    3)java com.task.Calculator add 5 3

 	*/
