package com.qa.pageLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Xcelhandel {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\IphoneBook2.xlsx";
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		//XSSFWorkBook wb=new XSSFWorkBook(fis);
	
	}

}
