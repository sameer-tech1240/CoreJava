package com.room;

public class ToString {
	
	public String toString() {
		System.out.println("Test toString called");
		return "";
	}
	

	public static void main(String args[]) {
		ToString s = new ToString();
		System.out.println(s.toString());
	}

}
