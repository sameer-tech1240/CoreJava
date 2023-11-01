package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter temperature in Celsius: ");
		double celsius = Double.parseDouble(reader.readLine());

		double fahrenheit = celsiusToFahrenheit(celsius);

		System.out.println("Temperature in Fahrenheit: " + fahrenheit);

		reader.close();
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;


	}
}
