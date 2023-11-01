package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommanElementInArray {
	public static void main(String[] args) {
		Integer a[] = {11,45,67,54};
		Integer b[] = {12,67,89,65,54,23,46,78};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(b));
		list.retainAll(list1);
		Integer[] array = list.toArray(new Integer[0]);
		System.out.println("comman element in array : " +Arrays.toString(array));
	}
	
	
	
	

}
