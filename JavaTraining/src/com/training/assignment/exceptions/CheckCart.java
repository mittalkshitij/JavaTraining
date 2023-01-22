package com.training.assignment.exceptions;

import java.util.ArrayList;

public class CheckCart {
	
	public void checkCartDetails(ArrayList<Items> list) throws CartEmptyException {
		
		if(!list.isEmpty()) {
			
			System.out.println("Cart : "+ list);
		}
		else {
			throw new CartEmptyException("Cart Empty");
		}
		
	}

}
