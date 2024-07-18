package com.Demo;

abstract class Animal   
{
	  int i;
	  
	 public Animal () //constructor create
	 {
		 
	 }
	  abstract void soundAnimal(); // Abstract method -->  by default public
	
	void display()   // Concrete method
	{
	
	}
	
	void kunal()
	{		
	
	}
	
	//abstract void ABC();
	
} 

class Cat extends Animal
{

	@Override
	void soundAnimal() {
		// TODO Auto-generated method stub
		 System.out.println("Meow..");
	}

	void ABC() {
		// TODO Auto-generated method stub
		
	}
}

class Cow extends Animal
{

	@Override
	void soundAnimal() {
		// TODO Auto-generated method stub
		 System.out.println("Hamma.. ");
	}

	void ABC() {
		// TODO Auto-generated method stub	
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// You cannot create object of a class
		
		// Animal a1=new Animal();
		
		Cat c1=new Cat(); // 
		Animal a1 = c1 ;  
		
		// Concrete class object is auto upcasted to the abstrct class

	}

}
