package com.classdemo;

class Demo
{
	public Demo()
	{
		
	}
	public Demo(int a)
	{
		System.out.println("value of a "+ a*a);
	}
	public Demo(int a, int b)
	{
		System.out.println("Multilication is   "+ a*b);
	}
	
	public Demo(int a, float b)
	{
		System.out.println("Multilication is   "+ a*b);
	}
	
}
public class Construct {

	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo(3);
		Demo d2=new Demo(3,9);
		Demo d3=new Demo(3, 9.1f);
		
		
		
	}

}

