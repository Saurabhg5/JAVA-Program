package com.Demo;

enum Shape
{
	Circle,
	Rectangle,
	Triangle
}
enum Days
{
	Monady,
	Tuesday,
	wednesday
}
enum Month
{
	January,
	Feb,
	March
}
enum Weekends
{
	sat,
	sun
}

enum Direction
{
	North,
	South,
	East,
	West
}

public class EnumerationDemo {

	public static void main(String[] args) {
	
		//Direction di1=Direction.North;
		//Direction di2=Direction.South;
		
		
		//System.out.println("First direction: " + di1);
		//System.out.println("First direction: " + di2);
		
		/*for(Direction dir : Direction.values())
		{
			System.out.println(dir);
		}*/
		
		Direction dir=Direction.North;
		if(dir == Direction.East)
			System.out.println("Direction: East");
		else if(dir == Direction.West)
		{
			System.out.println("Direction: East");
		}
		else if(dir == Direction.North)
		{
			System.out.println("Direction: East");
		}
		else
			System.out.println("Direction: South");
		
	}

}
