package basictest;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotr implements Constantss{
	
	public static void Ss(WebDriver driver, String Filename) throws IOException
	{
		
		java.util.Date d= new java.util.Date();
		String d1 = d.toString().replace(":", "-");// important otherwise jvm will get confusion 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(Defect_path+Filename+" "+d1+".png");
	    org.openqa.selenium.io.FileHandler.copy(Temp, perm);
		
		
	}

}
