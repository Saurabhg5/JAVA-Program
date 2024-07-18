package com.interfacedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        
        // Read the input string from the user
        String inputString = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Create a map to store the character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                // If the character is already in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        System.out.println("Character counts in the string: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}

