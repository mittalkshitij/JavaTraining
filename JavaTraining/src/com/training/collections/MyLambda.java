package com.training.collections;

import com.training.interfaces.Operation;

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation ref = (num1,num2)->{
		
			int sum=num1+num2;
			System.out.println("Addition = "+ sum);
		};
			
		ref.addition(100,200);
		ref.addition(500,200);
	}

}
