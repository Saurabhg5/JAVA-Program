package com.assignment;
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class Age_grp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = scanner.nextInt();
            checkVotingEligibility(age);
            System.out.println("You are eligible to vote.");
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }

    // Method to check if the user is eligible to vote
    public static void checkVotingEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be at least 18 years old to vote.");
        }
    }
}