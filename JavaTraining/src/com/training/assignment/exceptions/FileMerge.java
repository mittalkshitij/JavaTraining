package com.training.assignment.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("file3.rtf");
		
		BufferedReader b1= new BufferedReader (new FileReader("file1.rtf"));
		BufferedReader b2= new BufferedReader (new FileReader("file2.rtf"));
		
		String line1=b1.readLine();
		String line2=b2.readLine();
		
		while(line1!=null || line2!=null) {
			
			if(line1!=null) {
				pw.println(line1);
				line1=b1.readLine();
			}
			
			if(line2!=null) {
				
				pw.println(line2);
				line2=b2.readLine();
			}
		}
		pw.flush();
		
		b1.close();
		b2.close();
		pw.close();
		
		System.out.println("File Merged");
	}

}
