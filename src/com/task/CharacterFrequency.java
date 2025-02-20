package com.task;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		String sentence = "We are learning java...";

		Map<Character, Long> frequencyMap = sentence.chars().mapToObj(c -> (char) c).filter(space -> space != ' ')
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		frequencyMap.forEach(
				(character, frequency) -> System.out.println("Character: " + character + " Frequency: " + frequency));
	}

}
