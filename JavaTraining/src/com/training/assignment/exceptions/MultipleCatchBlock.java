package com.training.assignment.exceptions;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			
			a[3]=30/0;   // Arithmetic Exception - divide by 0
			
			//a[10]=20;  // Array Out of Bound Exception
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception");
		
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array out of bound exception");
		
		}catch(Exception e) {
			
			System.out.println("General Exception");
		}finally{
			System.out.println("Code executed");
			};
		}
	}


