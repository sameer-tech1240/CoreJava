package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExp {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add(10);
		v.add("sameer");
		v.add("100");   
		v.add(1.0);
        
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
	}

}
