package com.assignment;

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
public class StrExptn {
	public static void checkForVowels(String str) throws NoVowelsException {
        boolean containsVowels = false;
        // Loop through each character in the string and check if it's a vowel
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                containsVowels = true;
                break;
            }
        }
        // If no vowels found, throw exception
        if (!containsVowels) {
            throw new NoVowelsException("No vowels found in the input string.");
        }
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String testString = "Hello, World!";
        try {
            checkForVowels(testString);
            System.out.println("The input string contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
	