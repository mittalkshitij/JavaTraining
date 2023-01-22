package com.training.interfaces;

public class Demo implements Operation,Interface2 {

	@Override
	public void addition(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1+n2);
		
	}

	@Override
	public void difference(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1-n2);
		
		
	}
	
	@Override
	public int division(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
		
		
	}
	
	
	
	

}
