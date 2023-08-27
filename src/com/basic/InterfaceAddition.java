package com.basic;
interface Calculator{
	 int add(int a , int b);
	 
	 
	
}
public class InterfaceAddition implements Calculator {

	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	
public static void main(String[] args) {
	InterfaceAddition i = new InterfaceAddition();
	System.out.println(i.add(20, 10));
}



}
