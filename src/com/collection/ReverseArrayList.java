package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(78);
		arrayList.add(60);
		arrayList.add(45);
		arrayList.add(28);
		arrayList.add(88);
		System.out.println("Without reverse : " +arrayList);
		
		Collections.reverse(arrayList);
		
		System.err.println("After reverse : " +arrayList);
		
		
	}

}
