package com.training.oops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Welcome");
		
		Test t=new Test();
		t.display();
		t.putdata(5, 10);
		int x=t.getdata();
		
		System.out.print(x);
	}
	
	public void display()
	{
		System.out.print("In display");
	}
	
	public void putdata(int a,int b)
	{
		System.out.print(a+b);
	}
	
	public int getdata()
	{
		return 10;
	}

}
