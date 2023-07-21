package com.collection;

import java.util.ArrayList;
import java.util.List;

public class IndexMethod {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(32);
		al.add(43);
		al.add(65);
		al.add(98);
		al.add(12);
		al.add(32);
		
		System.out.println(al.indexOf(43));
		System.out.println(al.lastIndexOf(12));
	}

}
