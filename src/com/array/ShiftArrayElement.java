package com.array;

public class ShiftArrayElement {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int j = a.length-1;
		for(int i=0;i<j;i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
