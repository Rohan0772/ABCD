package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout1 {
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement logo;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement lgot;

	
	public Logout1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public WebElement clicklogo()
	{
		return logo;
	}
	public WebElement clicklgot()
	{
		return lgot;
	}
	

}
