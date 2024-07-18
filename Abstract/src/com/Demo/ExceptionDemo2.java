package com.Demo;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		String str=null;
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException nl)
		{
			System.out.println("str me value nahi hai to me kaise lenght find karu");
		}

	}

}
