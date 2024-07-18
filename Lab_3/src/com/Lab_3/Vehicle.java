package com.Lab_3;
class Vehicle1
{
	void drive()
	{
		System.out.println("Repairing Vehicle");
	}
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing Car");
	}
}
public class Vehicle 
{
	public static void main(String[]args) 
	{
		Vehicle1 v1 = new Vehicle1();
		v1.drive();
		
		Car c1 = new Car();
		c1.drive();
	}
}
