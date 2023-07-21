package com.array;

import java.util.Scanner;

public class DeleteArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size......");
		int size = sc.nextInt();
		System.out.println();
		int a[] = new int[size];
		System.out.println("Enet Array Element...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("which element do you want to delete....");
		int delete = sc.nextInt();
		for (int i = delete; i < size - 1; i++) {
			a[i] = a[i + 1];
			System.out.println("deleted element : " + delete);

		}
		size--;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
