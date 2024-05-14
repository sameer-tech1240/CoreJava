package com.oops;

import java.util.Random;

public class RandomPassword {
	public static String randomPassword(int length) {
		Random random = new Random();
		   StringBuilder randomChar = new StringBuilder();
	        String character = "1234567890";
	        for (int i = 0; i < length; i++) {
	            int randomnumber = random.nextInt(10);
	            randomChar.append(character.charAt(randomnumber));
		}
	        String string = randomChar.toString();
	        return string;
	}
	public static void main(String[] args) {
		System.out.println(randomPassword(6));
	}

}
