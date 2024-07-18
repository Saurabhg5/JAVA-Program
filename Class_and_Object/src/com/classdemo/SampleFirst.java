package com.classdemo;

class Sample
{
	int x=5;
}


public class SampleFirst {
	final int x=10; //instance variable
					// 10 will be the constant value for variable x which we define final
					// we can not modify the vlaue of x in throuht the program
	final float pi=3.14f; // example
	
	public static void main(String[] args) {
		SampleFirst sf1=new SampleFirst();
		//sf1.x=40;
		System.out.println(sf1.x); //10
		
		SampleFirst sf2=new SampleFirst();
		
		System.out.println(sf1.x);//10
		
		Sample sm=new Sample(); //creating the object of Sample class
		System.out.println(sf1.x);//10
		System.out.println(sf2.x);//10
		System.out.println(sm.x);//5
		

	}

}
