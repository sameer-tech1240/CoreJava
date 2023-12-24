package com.basic;

class Upper {
	private int age ;

	public Upper() {
		super();
		
	}

	public Upper(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
}
public class Encap extends Upper{
	public static void main(String[] args) {
		Encap e = new Encap();
		e.setAge(12);
		int age = e.getAge();
		System.out.println(age);
	} 

}
