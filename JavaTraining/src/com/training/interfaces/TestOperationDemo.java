package com.training.interfaces;

public class TestOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation ref;
		Demo obj=new Demo();
		
		ref=obj;
		ref.addition(10, 20);
		
		Interface2 intf;
		intf=obj;
		intf.difference(10, 5);
		
		System.out.println(ref.division(10, 5));
		
		System.out.println(Operation.multiplication(2,3));

	}

}
