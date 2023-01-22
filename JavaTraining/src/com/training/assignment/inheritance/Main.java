package com.training.assignment.inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int radius,breadth,length,side;
		
		System.out.println("Enter c to calculate area of Circle");
		System.out.println("Enter s to calculate area of Square");
		System.out.println("Enter r to calculate area of Rectangle");
		
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'c': System.out.println("Enter radius of the circle");
		radius=sc.nextInt();
		Circle circle=new Circle(radius);
		double ans1=circle.calculateArea();
		System.out.println("Area of cicle is "+ ans1);
		break;
		
		case 's': System.out.println("Enter side of the square");
		side=sc.nextInt();
		Square square=new Square(side);
		double ans2=square.calculateArea();
		System.out.println("Area of square is "+ ans2);
		break;
		
		case 'r': System.out.println("Enter length of the rectangle");
		length=sc.nextInt();
		System.out.println("Enter breadth of the rectangle");
		breadth=sc.nextInt();
		Rectangle rectangle=new Rectangle(length,breadth);
		double ans3=rectangle.calculateArea();
		System.out.println("Area of rectangle is "+ ans3);
		break;
		
		 default:
             System.out.println("Wrong choice!");
		
				  	
		}

	}

}
