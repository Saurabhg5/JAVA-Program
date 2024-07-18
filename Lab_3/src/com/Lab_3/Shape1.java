package com.Lab_3;

class Shape
{
	double getArea()
	{
		return 0.0;
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
		
	}
	double getArea()
	{
		return length*width;
		
	}
}

public class Shape1 
{
	public static void main(String[]args)
	{
		Rectangle r1 = new Rectangle(5,1.6);
		double area=r1.getArea();
		System.out.println("Area of Rectangle is:" +area);
	}

}
