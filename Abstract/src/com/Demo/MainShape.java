package com.Demo;

public class MainShape {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10,13);
		//Circle cir=new Circle(3);
		
		System.out.println("Area of the Rectangle is " + rec.getArea());
		
		//System.out.println("Area of the Rectangle is " + cir.getArea());

	}

}

public class Rectangle implements Shape{

	private double length;
    private double width;
    
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
		
	}

}


public interface Shape {

	double getArea();//abstract
}



public class Triangle implements Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}


