package com.assignment;

public class TryCatchBlk {
	public static void main(String[] args) {
        try {
            // Simulating a situation where an exception is thrown
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception and handling it
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to perform division, may throw an ArithmeticException
    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}