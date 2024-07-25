package com.comcat.crm.excelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcelFile(String sheetName,int row,int cell) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String org_name = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
		
		return org_name;
		

	}
	public int getRowsFromExcelFile(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int row_count = wb.getSheet(sheetName).getLastRowNum();
		
		wb.close();
		return row_count;

	}
	public void setDataToExcelFile(String sheetName,int row,int cell,String data) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./newconfig/TestScriptdata.xlsx");
		wb.write(fos);
		wb.close();

	}



}
