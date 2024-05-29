package com.orangeHRMPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement usn;
	@FindBy(name="password")
	private WebElement pwd;
	@FindBy(xpath=" //button[.=' Login ']")
	private WebElement lgn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public WebElement username()
	{
		return usn;
	}
	public WebElement password()
	{
		return pwd;
	}
	public WebElement login()
	{
		return lgn;
	}
	 
}
