package com.classdemo;

public class Example_double {

	
	public double minFunction(double n, int m)//n=a, m=b //parameter list
	{
		double min;
		//n*m=11.5*9=103.5
		if(n>m)
		{
			min=m;
		}
		else
		{
			min=n;
		}
		return min;
	}
	public static void main(String[] args) {
			
		Example_double eg=new Example_double();
		
		double c=eg.minFunction(18.5,12);//calling method (argument)
		System.out.println("Minimum Value" + c);
	}

}
