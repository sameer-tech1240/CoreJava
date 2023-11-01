package com.collection;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArrayList {
	public static void main(String[] args) {
		
		   List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(2); 
	        numbers.add(4);
	        numbers.add(3); 
	        findDuplicatesElement(numbers);
	    }
		public static void findDuplicatesElement(List<Integer> list) {
	        for (int i = 0; i < list.size(); i++) {
	            for (int j = i + 1; j < list.size(); j++) {
	                if (list.get(i).equals(list.get(j))) {
	                    System.out.println("Duplicate Element : " + list.get(j));
	                }
	            }
	        }
	    }
	
	}