package com.training.assignment.exceptions;

public class TestDividebyZero {
	
	public static void main(String[] args) {
		
		DivisionByZero d=new DivisionByZero();
		
		d.quotient(6, 0);
	}

}
