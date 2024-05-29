package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_LOGIN {
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' and .=' Login ']")
	private WebElement login;
	
	public HRM_LOGIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement Usn()
	{
		return username;
	}
	public WebElement pwd()
	{
		return password;
	}
	public WebElement lg()
	{
		return login;
	} 

} 
