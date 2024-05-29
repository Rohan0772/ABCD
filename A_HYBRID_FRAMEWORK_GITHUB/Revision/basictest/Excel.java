package basictest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constantss{
	public static String readexcel(String sheet, int row, int col) throws IOException
	{
	FileInputStream fis = new FileInputStream(Excel_path);
	Workbook book = WorkbookFactory.create(fis);
	Cell c= book.getSheet(sheet).getRow(row).getCell(col);
	String v=c.getStringCellValue();	
	return v;
	
	}

}
