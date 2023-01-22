package com.training.interfaces;

@FunctionalInterface
public interface Operation {
	
	void addition(int n1,int n2);
	
	//void display(int n1,int n2);
	
	default int division(int num1,int num2) {
		
		return num1/num2;
		
	}
	
	static int multiplication(int num1,int num2) {
		
		return num1*num2;
		
	}
		

}
