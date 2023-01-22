package com.training.exceptions;

public class Voter {

	public void validateAge(int age) {
		
		try {
		if(age>=18) {
			
		}else {
			
			throw new AgeInvalidException("Invalid Age");
		}
		}catch(AgeInvalidException e) {
			
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void fun() {
		System.out.println("Fun");
	}
}
