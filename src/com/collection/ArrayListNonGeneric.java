package com.collection;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add("sameer");
		list.add(11);
		list.add("aadil");
		
		for (Object li : list) {
			System.out.println(li);
			
		}
	}

}
