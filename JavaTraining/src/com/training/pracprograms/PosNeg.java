package com.training.pracprograms;

import java.util.Scanner;

public class PosNeg {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a>0)
			System.out.print("positive");
		else if(a<0)
			System.out.print("negative");
		else
			System.out.print("zero");
	}

}
