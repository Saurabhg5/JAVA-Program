package com.classdemo;

public class ConstructDemo {

	public ConstructDemo() // special type of method whose name of the method is exactly matching with class
	{
		System.out.println("Constructor start hua");
	}
	static public void show()
	{
		System.out.println("Normal Method");
	}
	
	public static void main(String[] args) {
		//ConstructDemo cs=new ConstructDemo();//object syntax
		ConstructDemo cs;//reference //created the reference of the class we ahve not allocated memory to the object by new keyword
		//cs.ConstructDemo();
		ConstructDemo.show();

	}

}
