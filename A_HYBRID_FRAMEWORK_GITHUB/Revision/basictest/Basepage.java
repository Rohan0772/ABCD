package basictest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHRMPageObject.Logout;

import pageobject.HRM_LOGIN;
import pageobject.Logout1;

public class Basepage implements Constantss {
	public WebDriver driver;
	public Properties prop;
	public HRM_LOGIN hm;
	public Logout1 lg;
	
	@BeforeClass
	public void sys() throws IOException
	{
		System.setProperty(Firefox_key, firefox_value);
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream fis = new FileInputStream("./Propertyfiles/Test.properties");
		prop = new Properties();
		prop.load(fis);
		String url1 =prop.getProperty("url");
		driver.get(url1);
	}
	@BeforeMethod
	public void login() 
	{
		hm= new HRM_LOGIN(driver);
		hm.Usn().sendKeys(prop.getProperty("usn1"));
		hm.pwd().sendKeys(prop.getProperty("pwd1"));
		hm.lg().click();
		
	}
	
	@AfterMethod
	public void Screen(ITestResult result) throws IOException
	{
		if(result.FAILURE==result.getStatus())
		{
			Screenshotr.Ss(driver, result.getName());
		}
	}
	@AfterClass
	public void logout() throws InterruptedException
	{
		lg = new Logout1(driver);
		lg.clicklogo().click();
		lg.clicklgot().click();
		Thread.sleep(2000);
		driver.close();
	}
}
