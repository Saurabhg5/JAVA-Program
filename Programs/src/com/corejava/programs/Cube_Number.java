package com.corejava.programs;
import java.util.Scanner;

public class Cube_Number {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("cube of the given number is "+(num*num*num));
	}
	
	

}
