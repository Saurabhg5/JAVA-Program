package com.Lab_3;

class AnimalN
{
	void makesound()
	{
		System.out.println("Animal making Noise");
	
	}
}
class Cat extends Animal_Sound
{
	void makesound()
	{
		System.out.println("The Cat saying Meow");
	}
}
public class Animal_Sound 
{
	public static void main(String[]args)
	{
		AnimalN a1 = new AnimalN();
		a1.makesound();
		
		Cat c1=new Cat();
		c1.makesound();
	}

}
