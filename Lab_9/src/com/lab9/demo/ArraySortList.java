//Write a Java program to sort a given array list.


package com.lab9.demo;

import java.util.ArrayList;
import java.util.Collections;

// A class to demonstrate sorting of ArrayList
public class ArraySortList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Saurabh");
        names.add("Akshay");
        names.add("Tushar");
        names.add("Rahul");
        names.add("Suraj");
        names.add("Kartik");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList : " + names);

        // Sort the ArrayList using Collections.sort() method
        Collections.sort(names);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList : " + names);
    }
}
/*Dry Run
Unsorted ArrayList : [Saurabh, Akshay, Tushar, Rahul, Suraj, Kartik]
Sorted ArrayList : [Akshay, Kartik, Rahul, Saurabh, Suraj, Tushar]
*/