
package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(101, "sameer");
		hs.put(102, "siddiqui");
		hs.put(103, "aadil");
		hs.put(104, "noor");
		hs.put(null, "null");
		
		hs.put(104, "null");
		System.out.println(hs.get(102));
		System.out.println(hs);
		for (Map.Entry em : hs.entrySet()) {

			System.out.println(em.getKey() + " " + em.getValue());

		}

		Set set = hs.entrySet();
		System.out.println(set);
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());

		}

	}

}
