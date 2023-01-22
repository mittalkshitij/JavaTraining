package com.training.assignment.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckFile {
	
	public void check() throws FileNotFoundException
	{
		File file=new File("file.txt");
		FileInputStream stream = new FileInputStream(file);
		
	}

}
