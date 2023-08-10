package com.room;

import com.room.Collage.Students;

class Collage {
	interface Students {
		abstract int numberOfStudents();
	}
}

class Teachers implements Students {

	public int numberOfStudents() {
		return 1500;
	}

}

public class NestedInterface {
	public static void main(String[] args) {
		Teachers teachers = new Teachers();
		System.out.println("First way to call numberofstudent method.....");
		int c = teachers.numberOfStudents();
		System.out.println(c);
		System.out.println("Second way to call numberofstudent method.....");
		System.out.println(teachers.numberOfStudents());

	}

}
