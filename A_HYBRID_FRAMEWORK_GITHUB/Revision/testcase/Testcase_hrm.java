package testcase;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRMPageObject.Homepage;

import basictest.Basepage;
import basictest.Excel;
import pageobject.Homepagex;

public class Testcase_hrm extends Basepage {
	Homepagex hp;

	
	@Test
	public void jingilala() throws InterruptedException, IOException
	{
//		hp = new Homepagex(driver);
//		Thread.sleep(2000);
//		hp.PIM().click();
//		Thread.sleep(2000);
//		hp.en().sendKeys("rohan");
//		hp.jb().sendKeys(Keys.ARROW_DOWN.ENTER);
//		hp.es().sendKeys(Keys.ARROW_DOWN.ENTER);
//		hp.su().sendKeys(Keys.ARROW_DOWN.ENTER);
	
//		hp.en().click();
//		hp.jb().click();
//		hp.es().click();
//		hp.su().click();
		
		//NORMAL
//		hp= new Homepagex(driver);
//		Thread.sleep(2000);
//		hp.clickpim().click();
//		Thread.sleep(2000);
//		hp.addemp().click();
//		hp.firstn().sendKeys("rohan");
//		hp.Lasttn().sendKeys("assd");
//		Thread.sleep(2000);
//		hp.savebtn().click();
		
		//DATA DRIVEN 
		driver.manage().deleteAllCookies();
		hp= new Homepagex(driver);
		Thread.sleep(2000);
		hp.clickpim().click();
		Thread.sleep(2000);
		hp.addemp().click();
		hp.firstn().sendKeys(Excel.readexcel("sheet1", 1, 0));
		hp.Lasttn().sendKeys(Excel.readexcel("sheet1", 1, 1));
		Thread.sleep(2000);
		hp.savebtn().click();
		Assert.fail();
		
		
		
	}

}
