package com.training.inheritance;

public class Child extends Parent{

	int c=10;
	
	public Child() {
		
	}
	
	public Child(int c)
	{
		super(100);
		//this()  -- It will call the constructor of its own class
		this.c=c;
	}
	public void show() {
		
		System.out.println("Child");
	}
	
	public void display() {
		
		System.out.println("Child display");
	}
	
	public void addition()
	{
		int sum=p+c;
		
		System.out.println("Sum = "+ sum);
	}
}
