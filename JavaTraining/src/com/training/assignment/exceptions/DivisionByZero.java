package com.training.assignment.exceptions;

public class DivisionByZero {
	
	public void quotient(int n1,int n2) {
		
		int div = 0;
		
		try {
		
		div=n1/n2;
		}catch(ArithmeticException e) {
			System.out.println("Division by Zero Error");
			e.printStackTrace();
		}
		finally {
		System.out.println("Division = "+ div);
		}
		
	}

}
