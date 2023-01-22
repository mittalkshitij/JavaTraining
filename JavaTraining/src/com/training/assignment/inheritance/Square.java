package com.training.assignment.inheritance;

public class Square extends Shape {
	
	protected int side;
	

	public Square(int side) {
		super("Square");
		this.side=side;
	}
	
	public double calculateArea() {
		
		double area=side*side;
		return area;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	
}
