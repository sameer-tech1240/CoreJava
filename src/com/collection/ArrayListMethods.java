package com.collection;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al.add("abc"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(400));
		al.remove(1);
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add("aaa");
		al2.add(100);
		al.removeAll(al2);
		System.out.println(al);
		al2.clear();
		System.out.println(al2);
		
	}

}
