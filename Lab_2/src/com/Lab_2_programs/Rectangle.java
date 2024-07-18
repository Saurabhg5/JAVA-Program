package com.Lab_2_programs;
import java.util.Scanner;

public class Rectangle
{
	double height, width, area, peri;
	
	void calArea()
	{
		area = height*width;
		System.out.println("Area of rectangle is:"+area);
	}
	
	void calPerimeter()
	{
		peri = 2*(height + width);
		System.out.println("Perimeter of rectangle:"+peri);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height:");
		double height=sc.nextDouble();
		
		System.out.println("Enter Width:");
		double width = sc.nextDouble();
		
		Rectangle r1 = new Rectangle();
		r1.height = height;
		r1.width = width;
		r1.calArea();
		r1.calPerimeter();
	}
}