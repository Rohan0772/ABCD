package com.orangeHRM.basictest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A2_Data_excel implements A1_Frameworkconstant {
	public static String ReadData(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis;
		Workbook Book;
		
		fis = new FileInputStream(Excel_path);
		Book = WorkbookFactory.create(fis);
		Cell cel=Book.getSheet(sheet).getRow(row).getCell(cell);
		String value =cel.getStringCellValue().toString();
		return value;
		
	}
	

}
