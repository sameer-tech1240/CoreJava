package com.task;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingArray {

	    public static void main(String[] args) {
	        int[] a = {1, 2, 4, 5, 7};
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        // Array ko ArrayList me convert karna
	        for (int num : a) {
	            list.add(num);
	        }

	        // Minimum aur maximum values ko find karna
	        int min = Arrays.stream(a).min().orElseThrow();
	        int max = Arrays.stream(a).max().orElseThrow();

	        // Missing numbers ko find karna aur list me add karna
	        for (int i = min; i <= max; i++) {
	            if (!list.contains(i)) {
	                list.add(i);
	            }
	        }

	        // Updated ArrayList ko array me convert karna
	        int[] updatedArray = list.stream().mapToInt(Integer::intValue).toArray();

	        // Result ko print karna
	        System.out.println("Updated Array: " + Arrays.toString(updatedArray));
	 
}
}
