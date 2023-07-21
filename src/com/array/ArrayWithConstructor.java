package com.array;

class Student {
	int roll_no;
	String name;

	public Student(int roll_no, String name) {

		this.roll_no = roll_no;
		this.name = name;

	}

}

public class ArrayWithConstructor {
	public static void main(String[] args) {
		Student[] s = new Student[5];
		s[0]=new Student(1,"khan");
		s[1]=new Student(2, "Sameer");
		s[2]=new Student(3, "Aadil");
		s[3]=new Student(4, "Shoaib");
		s[4]=new Student(5, "bye bye");
for (int i = 0; i < s.length; i++) {
	System.out.println(i+" : " +s[i].roll_no+" "+s[i].name);
	
}
	}
	
	
}
