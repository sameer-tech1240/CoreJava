package com.task;

import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckNamePresentInArray {

	public static void main(String[] args) {

		String[] names = { "Sameer", "Abrar", "Aadil", "Mushahid", "Ayaz" , "Sameer"};

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name to search: ");
		String searchName = scanner.nextLine();

		OptionalInt indexOpt = IntStream.range(0, names.length).filter(i -> names[i].equalsIgnoreCase(searchName))
				.findFirst();
		if (indexOpt.isPresent()) {
			System.out.println("Name found at index: " + indexOpt.getAsInt());
		} else {
			System.out.println("Name not found in the array.");
		}

		scanner.close();
	}

}
