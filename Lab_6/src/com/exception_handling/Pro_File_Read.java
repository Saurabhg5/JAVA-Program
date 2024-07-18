package com.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pro_File_Read {
  public static void main(String[] args) {
    try 
    {
      readFile("intro.txt");
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner sc = new Scanner(file);

    
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      System.out.println(line);
    }

 
  }
}