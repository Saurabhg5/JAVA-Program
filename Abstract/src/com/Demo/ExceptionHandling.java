package com.Demo;

public class ExceptionHandling
{

	public static void main(String[] args) {
		System.out.println("Ye statement execute hoga");
		try
		{
		Integer i=new Integer("abc"); //NumebrFormatException
		}
		catch(NumberFormatException ex)
		{
			System.out.println("String value hai");
		}
		//int a="abc";
		
		System.out.println("ye stament execute nahi hoga");

	}

}
