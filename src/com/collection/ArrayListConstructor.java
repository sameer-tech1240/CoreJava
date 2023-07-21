package com.collection;

import java.util.ArrayList;

public class ArrayListConstructor {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	ArrayList<Integer> al1 = new ArrayList<>(al);
	al1.add(400);
	al1.add(500);
	ArrayList<Integer> al2 = new ArrayList<>(al1);
	System.out.println(al2);
}
}
