package com.classdemo;

public class StaticDemo {

	static int a=0; //static variable;
	int b;         // instance varibale 
	public void display()
	{
		int c=0; // local method
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		StaticDemo sd1=new StaticDemo();
		sd1.display();
		StaticDemo sd2=new StaticDemo();
		sd2.display();
		StaticDemo sd3=new StaticDemo();
		sd3.display();
	}

}
