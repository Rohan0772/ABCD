package com.orangeHRMPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[.='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement Aemp;
	
	@FindBy(name="firstName")
	private WebElement fn;
	
	@FindBy(name="lastName")
	private WebElement ln;


	@FindBy(xpath="//button[.=' Save ']")
	private WebElement save;

	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickpim()
	{
		return pim;
	}
	
	public WebElement addemp()
	{
		return Aemp;
	}
	
	public WebElement firstn()
	{
		return fn;
	}
	public WebElement Lasttn()
	{
		return ln;
	}
	public WebElement savebtn()
	{
		return save;
	}

}
