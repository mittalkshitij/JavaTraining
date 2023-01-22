package com.training.pracprograms;

import java.util.Scanner;

public class Cube {
	
	static int cube(int x)
	{
		x=x*x*x;
		
		return x;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int ans=cube(a);
		
		System.out.print(ans);
		
		
		
	}

}
