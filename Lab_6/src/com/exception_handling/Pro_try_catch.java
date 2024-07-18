package com.exception_handling;

public class Pro_try_catch 
{

	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0;
			int res =a/b;
			System.out.println("Result is:"+res);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot divide by zero.");
		}
	}

}