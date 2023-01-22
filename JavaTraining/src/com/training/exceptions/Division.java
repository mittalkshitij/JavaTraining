package com.training.exceptions;

public class Division {
	
	public void division(int n1,int n2)
	{
		int div=n1/n2;
		System.out.println(div);
		System.out.println("Division Done");
	}
	
	public void fun() throws InterruptedException {
		
	
		System.out.println("FUN");
		Thread.sleep(1000);          // Compile time exception

	}

}
