package com.orangeHRM.basictest;

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

import com.orangeHRMPageObject.Homepage;
import com.orangeHRMPageObject.LoginPage;
import com.orangeHRMPageObject.Logout;

public class Basepagee implements A1_Frameworkconstant {
	public WebDriver driver;
	public LoginPage lp;
	public Properties pro;
	public Homepage hp;
	public Logout lg ;
	@BeforeClass
	public void open() throws IOException
	{
		System.setProperty(Firefox_key,Firefox_value);
		driver = new FirefoxDriver();
		pro = new Properties();
		FileInputStream fis = new FileInputStream("./PropertyFiles/Test.properties");
		pro.load(fis);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	}
	@BeforeMethod
	public void log()
	{
		lp = new LoginPage(driver);
		lp.username().sendKeys(pro.getProperty("usn1"));
		lp.password().sendKeys(pro.getProperty("pwd1"));
		lp.login().click();	
		
//		hp= new Homepage(driver);
//		hp.clickpim().click();
//		hp.addemp().click();
//		hp.firstn().sendKeys("rohan");
//		hp.Lasttn().sendKeys("assd");
//		hp.savebtn().click();
				
	}
	@AfterMethod
	public void logoutt(ITestResult result) throws IOException// FOR SCREENSHOT
	{
		if(result.FAILURE==result.getStatus())
		{
			Screenshot.defect(driver, result.getName());
		}
		
		
	}
	
	@AfterClass
	public void close()
	{
		lg = new Logout(driver);
		lg.clicklogo().click();
		lg.clicklgot().click();
		driver.close();
	}

}
