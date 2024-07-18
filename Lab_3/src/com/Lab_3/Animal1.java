package com.Lab_3;

class Animal
{
	void move()
	{
		System.out.println("Animal Moving");
	}
}
class Cheetah extends Animal
{
	void move()
	{
		System.out.println("Cheeta Moving");
	}
}

public class Animal1 
{
	public static void main(String[]args)
	{
		Animal a1 = new Animal();
		a1.move();
		Cheetah c1 = new Cheetah();
		c1.move();
	}
}
