package com.training.pracprograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0) {
				
				flag=true;
				break;
			}
		}
		
		if(flag==false)
			System.out.print("prime");
		else
			System.out.print("not prime");

	}

}
