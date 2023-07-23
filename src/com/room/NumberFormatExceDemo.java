package com.room;

public class NumberFormatExceDemo {
	   private static final String inputString = "123.33";   
	      
	    public static void main(String[] args) {  
	        try {  
	                 int a = Integer.parseInt(inputString);  
	        }catch(NumberFormatException ex){  
	            System.err.println("Invalid string in argumment"+  ex);  
	            
	        }  
	            
	    }
}
