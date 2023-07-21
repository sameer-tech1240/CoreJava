package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRetrive {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(12);
		hs.add(23);
		hs.add(32);
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
