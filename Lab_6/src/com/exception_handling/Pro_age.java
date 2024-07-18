package com.exception_handling;

public class Pro_age {
	void validate(int age) throws ArithmeticException
	{
		
		if(age<18)
		throw new ArithmeticException ("age is not valid"); 
		else
			System.out.println("You are eligible for voting");
	}
	public static void main(String[] args)
	{
		Pro_age td = new Pro_age();
		try
		{
			td.validate(23);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for Voting");
		}
		
	}
}
