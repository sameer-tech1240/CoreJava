package com.array;

public class ReverseArray1 {
	public static void main(String[] args) {
		int i = 0;
		int arr[] = { 32, 54, 31, 99 };
		System.out.println("The reversed array is...");
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.println(arr[j2]);
		}
	}

}
