package com.basic;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your choice (add/sub/multiply): ");
        String choice = scanner.nextLine();
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        if (choice.equalsIgnoreCase("add")) {
            result = num1 + num2;
        } else if (choice.equalsIgnoreCase("subtract")) {
            result = num1 - num2;
        } else if (choice.equalsIgnoreCase("multiply")) {
            result = num1 * num2;
        } else {
            System.out.println("Invalid operation");
            System.exit(0);
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
