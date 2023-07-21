package com.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSearch {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Collections.addAll(list, "sameer", "aadil");
		System.out.println(list.get(1));  //get aadil
		System.out.println(list.remove(1));  //remove aadil
		System.out.println(list);    //print sameer
	}

}
