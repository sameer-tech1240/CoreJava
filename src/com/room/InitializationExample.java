package com.room;

	public class InitializationExample {
	    // Static variables
	    static int staticVar = 10;

	    // Static block
	    static {
	        System.out.println("Static block: This will be executed first.");
	    }

	    // Instance variables
	    int instanceVar = 20;

	    // Instance block
	    {
	        System.out.println("Instance block: This will be executed second.");
	    }
 
	    // Constructor
	    public InitializationExample() {
	        System.out.println("Constructor: This will be executed third.");
	    }

	    public static void main(String[] args) {
	        System.out.println("Main method: This will be executed last.");

	        // Creating an object of InitializationExample class
	        InitializationExample example = new InitializationExample();
	    
	}

}
