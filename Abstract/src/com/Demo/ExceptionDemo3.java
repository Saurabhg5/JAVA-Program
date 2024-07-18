package com.Demo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{
			int i=arr[4];
			System.out.println("muze excecute hona hai");
		}
		catch(ArrayIndexOutOfBoundsException arb)
		{
			System.out.println("searching number is greater thatn the defined range");
		}

	}

}
