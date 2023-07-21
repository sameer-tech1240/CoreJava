package com.collection;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(16);
		a.add(17);
		a.add(18);
		a.add(19);
		a.add(65);
		a.add(97);
		a.add(100);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.add(3,21);
		System.out.println(a);

	}

}
