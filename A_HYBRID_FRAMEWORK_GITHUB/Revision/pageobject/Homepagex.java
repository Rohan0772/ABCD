package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagex {
//	@FindBy(xpath="//span[.='PIM']")
//	private WebElement pim;
//	
//	@FindBy(xpath="(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]")
//	private WebElement ename;
//	
//	@FindBy(xpath="(//div[.='-- Select --'])[1]")
//	private WebElement empstat;	
//	
//	@FindBy(xpath="(//div[.='-- Select --'])[5]")
//	private WebElement jobtitle;
//	
//	@FindBy(xpath="(//div[.='-- Select --'])[9]")
//	private WebElement subunit;
//	
//	public Homepagex(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	public WebElement PIM()
//	{
//		return pim;
//	}
//	public WebElement en()
//	{
//		return ename;
//	}
//	public WebElement es()
//	{
//		return empstat;
//	}
//	public WebElement jb()
//	{
//		return jobtitle;
//	}
//	public WebElement su()
//	{
//		return subunit;
//	}
	
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

	
	public Homepagex(WebDriver driver)
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
