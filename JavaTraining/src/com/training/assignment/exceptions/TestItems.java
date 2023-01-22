package com.training.assignment.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class TestItems {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Items> items=new ArrayList<>();
		
		System.out.println("ENTER THE NUMBER OF ITEMS : ");
		int n=sc.nextInt();
		
		while(n!=0) {
			
			System.out.println("Enter item ID : ");
			int itemId= sc.nextInt();
			
			System.out.println("Enter item name : ");
			String name=sc.next();
			
			System.out.println("Enter item price : ");
			int price=sc.nextInt();
			
			items.add(new Items(itemId,name,price));
			
			n--;
			
		}
		
		CheckCart check=new CheckCart();
		try {
			check.checkCartDetails(items);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
