package com.training.inheritance;

public class TestParentChild {
	
	public static void main(String[] args)
	{
		
		Child child=new Child(200);
		child.display();
		child.show();
		child.addition();
		
		
		Parent ref;
		ref=new Parent();
		ref.display(); // Parent
		
		ref=new Child();
		ref.display();//Child
		
		TestParentChild.demo(new Parent());
		TestParentChild.demo(new Child());
	
		
		
	}
	
	public static void demo(Parent obj) {
		
		obj.display();
	}

}
