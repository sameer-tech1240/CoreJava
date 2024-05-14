package com.basic;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {

		/*
		 * System.out.println("hello java"); // TODO Auto-generated method stub int a[]=
		 * {1,2,3,4,5}; System.out.println(a);
		 */

		// String name = new String("null");
		// String name2 ="NULL";
		// String name3=name.toUpperCase();
		// System.out.println(name == "null");
		String url = "jdbc:mysql://localhost:3306/" + "sameer";
		System.out.println(url);
		ArrayList<Object> arr = new ArrayList<>();
		arr.add(1);
		arr.add(43);
		arr.add(12);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
