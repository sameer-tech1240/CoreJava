package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExp {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(433);
		l.add(432);
		l.add(213);
		l.add(765);
		
		System.out.println("Forward.....");
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
			
		}
		System.out.println("Backward.....");
		while (li.hasPrevious()) {
		System.out.println(li.previous());
			
		}
		
	}

}
