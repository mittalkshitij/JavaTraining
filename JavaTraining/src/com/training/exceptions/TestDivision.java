package com.training.exceptions;

public class TestDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("In main divison");
		Division obj=new Division();
		try {
		
		obj.division(10, 0);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			obj.fun();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("END");

	}

}
