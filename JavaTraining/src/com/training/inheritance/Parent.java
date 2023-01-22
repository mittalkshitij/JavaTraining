package com.training.inheritance;

public class Parent {
	
	protected int p;
	
	public Parent() {
		
		System.out.println("Parent Non-parametrized Constructor");
	}
	
	public Parent(int p) {
		
		this.p=p;
		System.out.println("Parent Parameterized Constructor");
	}
	
	public void display() {
		p=10;
		System.out.println("Parent display");
	}

}
