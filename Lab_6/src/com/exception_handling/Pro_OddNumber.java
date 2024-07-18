package com.exception_handling;

public class Pro_OddNumber 
{
    public static void main(String[] args)
    {
        int number = 12; // Change this to test different numbers

        try
        {
            checkIfEven(number);
            System.out.println(number + " is even.");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(number + " is odd.");
        }
    }

    public static void checkIfEven(int number) throws IllegalArgumentException 
    {
        if (number % 2 != 0) 
        {
            throw new IllegalArgumentException("Number is odd.");
        }
    }
}