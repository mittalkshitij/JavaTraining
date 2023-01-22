package com.training.assignment.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatches {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			
			String name=null;
			System.out.println(name.length());  // Null Pointer Exception
			
			a[3]=30/0;   // Arithmetic Exception - divide by 0
			
			a[10]=20;  // Array Out of Bound Exception
			
			File file=new File("file.txt");
			FileInputStream stream = new FileInputStream(file);
			
		}catch(NullPointerException e) {
			
			System.out.println("Null Pointer Exception");
		
		}catch(ArithmeticException e){
			
			System.out.println("Arithmetic Exception exception");
		
		}catch(FileNotFoundException e) {
			
			System.out.println("File Not Found Exception");
		}
			
		System.out.println("Code executed");
			
		}
	}


