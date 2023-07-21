package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add(101);
		v.add(102);
		v.add(103);
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
