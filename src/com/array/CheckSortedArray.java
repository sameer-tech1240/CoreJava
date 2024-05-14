package com.array;
public class CheckSortedArray {
	public static boolean isSortedAscending(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] sortedArray = { 3,2,4,6,7 };
		System.out.println("Is sortedArray sorted? " + isSortedAscending(sortedArray));

	}

}
