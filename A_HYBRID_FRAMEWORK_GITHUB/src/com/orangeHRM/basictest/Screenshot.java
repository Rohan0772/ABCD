package com.orangeHRM.basictest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements A1_Frameworkconstant
{
	
	public static void defect(WebDriver driver,String Filename) throws IOException
	{
	Date d= new Date();
	String d1 = d.toString().replace(":", "-");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File Temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File(Defect_path+Filename+" "+d1+".png");
    org.openqa.selenium.io.FileHandler.copy(Temp, perm);
    
	}

}
