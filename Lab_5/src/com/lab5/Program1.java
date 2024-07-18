package com.lab5;

abstract class Vehicle
{
	 abstract void startEngine();
	 abstract void stopEngine();
}
class Car extends Vehicle
{
	

	@Override
	void startEngine() 
	{
		System.out.println("Car : Starts the Engie");
	}

	@Override
	void stopEngine()
	{
		System.out.println("Car: Stop the Engine" );
	}
}

class MotorCycle extends Vehicle
{

	@Override
	void startEngine()
	{
		System.out.println("Motorcycle : Start the Engine");
	}

	@Override
	void stopEngine()
	{
		System.out.println("Motorcycle : Stop the Engine");
	}
	
}

public class Program1 
{

	public static void main(String[] args)
	{
		Vehicle car = new Car();
		Vehicle motor = new MotorCycle();
		
		car.startEngine();
		car.stopEngine();
		
		motor.startEngine();
		motor.stopEngine();
		
	}

}
