package com.collection;

import java.util.ArrayList;

public class DuplicateInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(15);
		arrayList.add(54);
		arrayList.add(12);
		arrayList.add(15);
		int repeatElement = 1000;
		int countArray[] = new int[repeatElement + 1];
		for (Integer element : arrayList) {
			countArray[element]++;
		}
		System.out.println("Duplicate is ArrayList....");
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 1) {
				System.out.println(i + " apears " + countArray[i] + " times ");

			}

		}

	}

}
