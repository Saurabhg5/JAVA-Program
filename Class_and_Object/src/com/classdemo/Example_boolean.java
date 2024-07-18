package com.classdemo;

public class Example_boolean {

	public boolean minFunction(int n, int m)//n=a, m=b
	{ // if m is min then return true and if n is min then return false
		boolean min;
		if(n>m)
		{
			min=true;
		}
		else
		{
			min=false;
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		Example_boolean ex=new Example_boolean();
		//boolean result=ex.minFunction(3, 9);
		System.out.println("minimum value " + ex.minFunction(12, 9));
		//System.out.println("Minimum Value " + result);
	}

}
