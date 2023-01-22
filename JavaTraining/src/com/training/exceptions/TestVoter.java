package com.training.exceptions;

public class TestVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voter voter=new Voter();
		voter.validateAge(1);
		System.out.println("Validation Done");
		voter.fun();
		

	}

}
