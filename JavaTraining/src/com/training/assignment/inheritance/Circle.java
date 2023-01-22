package com.training.assignment.inheritance;

public class Circle extends Shape{
	
	protected int radius;
		
	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public double calculateArea() {
		
		return 3.14*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
