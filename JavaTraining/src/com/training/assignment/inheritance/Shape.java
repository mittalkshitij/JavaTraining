package com.training.assignment.inheritance;

public class Shape {
	
	protected String shapeName;
		
	public Shape(String shapeName) {
		
		this.shapeName=shapeName;
	}
	
	public double calculateArea() {
		
		return 0.0;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
