package com.training.pracprograms;

import java.util.Scanner;

public class Maxthree {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.print("a is greatest");
		
		else if(b>a && b>c)
			System.out.print("b is greatest");
		else
			System.out.print("c is greatest");
	}

}
