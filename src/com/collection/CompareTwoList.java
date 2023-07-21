package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompareTwoList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Collections.addAll(list, "sameer", "aadil");
		List<String> list1 = new LinkedList<>();
		Collections.addAll(list1, "sameer", "aadil");
		boolean b = list.equals(list1);
		System.out.println(b);
	}

}
