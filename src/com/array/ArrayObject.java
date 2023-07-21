package com.array;

public class ArrayObject {
	int id;
	String name;
	int age;

	public static void main(String[] args) {
		ArrayObject ob = new ArrayObject();
		ob.id = 101;
		ob.name = "Sameer";
		ob.age = 18;

		ArrayObject ob1 = new ArrayObject();
		ob1.id = 102;
		ob1.name = "Aadil";
		ob1.age = 19;

		ArrayObject ob2 = new ArrayObject();
		ob2.id = 103;
		ob2.name = "Shoaib";
		ob2.age = 20;

		ArrayObject[] obj = new ArrayObject[3];
		obj[0] = ob;
		obj[1] = ob1;
		obj[2] = ob2;

		for (int i = 0; i < obj.length; i++) {
			System.out.println("Student Id Number : " + obj[i].id + "\nStudent  Name : " + obj[i].name
					+ "\nStudent Age : " + obj[i].age+ "\n---------------------------------------");
		}

	}

}
