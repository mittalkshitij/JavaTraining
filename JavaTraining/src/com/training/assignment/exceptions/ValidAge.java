package com.training.assignment.exceptions;


public class ValidAge {
	
	public void checkAge(int age) {
		
		try{
			if(age<19) {
				
				throw new InvalidAgeException("Invalid Age");
			}
		}catch(InvalidAgeException e) {
			
			
			e.printStackTrace();
		}
	}

}
