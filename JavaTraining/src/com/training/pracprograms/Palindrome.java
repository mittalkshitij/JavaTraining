package com.training.pracprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int temp=a,z;
		int rev=0;
		
		
		while(a>0)
		{
			z=a%10;
			rev=rev*10+z;
			a=a/10;
		}
		
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("NOT Palindrome");

	}

}
