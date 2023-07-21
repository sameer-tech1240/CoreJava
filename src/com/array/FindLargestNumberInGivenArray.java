package com.array;

public class FindLargestNumberInGivenArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,6,8,6,12};
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
				temp=a[i];
			}
			
		}
		System.out.println("Largest number in the array is : "+temp);

	}

}
