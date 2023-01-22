package com.training.assignment.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResource {

	public static void main(String[] args) {
		
		String line;
		
		try(BufferedReader br=new BufferedReader(new FileReader("file1.txt"))) {
			
			while ((line = br.readLine()) != null) {
		        System.out.println("Line =>"+line);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
