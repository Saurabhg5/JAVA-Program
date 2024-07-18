package com.assignment;

//Custom Exception class for handling cases when the number is odd
class OddNumberException extends Exception {
public OddNumberException(String message) {
   super(message);
}
}
public class EvenOdd {
	// Method to check if a number is even
  public static void checkEvenNumber(int number) throws OddNumberException {
      if (number % 2 != 0) {
          throw new OddNumberException("The number is odd.");
      }
  }
  public static void main(String[] args) {
      int testNumber = 7; // Change this to test different numbers
      try {
          checkEvenNumber(testNumber);
          System.out.println("The number is even.");
      } catch (OddNumberException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}