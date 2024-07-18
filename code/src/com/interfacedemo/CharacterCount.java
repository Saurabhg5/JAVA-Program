package com.interfacedemo;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        // Read the input string from the user
        String inputString = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Find the Character Count
        int charCount = inputString.length();

        // Print the Character Count
        System.out.println("Character count in the string: " + charCount);
    }
}
