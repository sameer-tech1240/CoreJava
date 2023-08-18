package com.basic;
import java.util.Scanner;
public class Calculator2 {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the operation (add/subtract/multiply): ");
	        String operation = scanner.nextLine();
	        
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        
	        double result = 0; 
	        
	        switch (operation) {
	            case "add":
	                result = num1 + num2;
	                break;
	            case "subtract":
	                result = num1 - num2;
	                break;
	            case "multiply":
	                result = num1 * num2;
	                break;
	            default:
	                System.out.println("Invalid operation");
	                System.exit(0);
	        }
	        
	        System.out.println("Result: " + result);
	        
	        scanner.close();
	    }
	

}
