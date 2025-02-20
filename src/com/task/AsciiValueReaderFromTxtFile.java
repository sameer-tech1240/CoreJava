package com.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AsciiValueReaderFromTxtFile {
    public static void main(String[] args) {
        String fileName = "C:/Users/admin/Downloads/input.txt"; // Specify your input file name here

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Character | ASCII Value");
            System.out.println("-----------------------");
            while ((line = br.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    // Display character and its ASCII value
                    System.out.printf("%-10c | %d%n", ch, (int) ch);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
