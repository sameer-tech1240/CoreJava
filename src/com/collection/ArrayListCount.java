package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCount {
	public static void main(String[] args) {
		//List <Object> list = new ArrayList<>();
		Object [] objects = {"sameer","aadil",22,33,44,55,55.6,77.6};
		/*
		 * list.add("sameer"); list.add("aadil"); list.add(100); list.add(12.3);
		 * list.add(32); list.add(32.8);
		 */
		int count = 0;
		int stringCount = 0;
		int doubleCount = 0;
		
		for (Object object : objects) {
			if (object instanceof Integer) {
				count++;	
			}
			else if (object instanceof Double) {
				doubleCount++;	
			}
			else if (object instanceof String) {
				stringCount++;
			}
		
		}
		System.out.println("Integer type element is : " + stringCount);
	}

}                              
