package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shorting_Arraylist_Example {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(32);
		list.add(35);
		list.add(56);
		list.add(12);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
