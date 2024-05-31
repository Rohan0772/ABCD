

package com.orangeHRMtestcase12;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangeHRM.basictest.Basepagee;
import com.orangeHRMPageObject.Homepage;

public class Testcase_id extends Basepagee {

	@Test
	public void test()
	{
		hp= new Homepage(driver);
		hp.clickpim().click();
		hp.addemp().click();
		hp.firstn().sendKeys("rohan");
		hp.Lasttn().sendKeys("assd");
		hp.savebtn().click();
		System.out.println("WElcomeee");
		Reporter.log("swati");
		
	}


//@Test
//public void test1() throws IOException
//{
//	
//	for(int i =1;i<=3;i++)
//	{
//		for(int j=0;j<=1;j++)
//		{
//			hp= new Homepage(driver);
//			hp.clickpim().click();
//			hp.addemp().click();
//			hp.firstn().sendKeys(A2_Data_excel.ReadData("Sheet1", i, j));
//			hp.savebtn().click();
//		}
//	}
	//hp.firstn().sendKeys(Data_excel.ReadData("Sheet1", 1, 0));
	//hp.Lasttn().sendKeys(Data_excel.ReadData("Sheet1", 1, 1));
	//Assert.fail();

//}

}
 