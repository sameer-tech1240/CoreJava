package com.collection;

//import java.io.DataOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
	public static void main(String[] args) {
		
		HashSet<HasSet2> h=new HashSet<>();
		/*
		 * HashSet<Integer> h1=new HashSet<>(); h1.add(12); h1.add(12); h1.add(12);
		 */
		 // System.out.println(h1);
		HasSet2 e=new HasSet2(100);
		HasSet2 e1=new HasSet2(100);
		HasSet2 e2=new HasSet2(100);
		HasSet2 e3=new HasSet2(1212);
		 
		h.add(e);
		h.add(e1);
		h.add(e2);
		h.add(e3);
	//	System.out.println(h);
		Iterator i=h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}
