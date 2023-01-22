package com.training.assignment.exceptions;

import java.io.FileNotFoundException;

public class TestCheckFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckFile check=new CheckFile();
		
		try {
			check.check();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not present");
			e.printStackTrace();
		}

	}

}
