package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JOptionPane;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(101, "sameer");
		map.put(102, "khan");
		map.put(103, "aadil");
		map.put(104, "siddiqui");
		

		Set s = map.entrySet();

		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println(entry);
			
		}
		JOptionPane.showConfirmDialog(null, "Fuck");

	}

}
