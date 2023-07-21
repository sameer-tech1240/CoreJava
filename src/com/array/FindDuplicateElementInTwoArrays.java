package com.array;

public class FindDuplicateElementInTwoArrays {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {4,1,5,6,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println("Duplicate Element : " +a[i]);
				}
			}
		}
	}

}
