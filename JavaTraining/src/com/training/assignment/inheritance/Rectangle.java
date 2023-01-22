package com.training.assignment.inheritance;

public class Rectangle extends Shape{

	protected int length;
	protected int breadth;
		
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		double area=length*breadth;
		return area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
}
