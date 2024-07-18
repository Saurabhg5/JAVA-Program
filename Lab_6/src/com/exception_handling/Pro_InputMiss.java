package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pro_InputMiss
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Integer:");
		try
		{
			int n1 = sc.nextInt();
			System.out.println("Entered Value:"+n1);
		} 
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input.Please Enter an Integer5");
		}
	}

}
