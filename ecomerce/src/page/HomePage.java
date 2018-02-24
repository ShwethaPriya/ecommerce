package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath= "//span[text()='Account']")
	private WebElement Acount;
	
	@FindBy(xpath= "//a[@title='Register']")
	private WebElement Register ;
	
	@FindBy(xpath= "//a[text()='Mobile']")
	private WebElement Mobile;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_account()
	{
		Acount.click();
	}
	
	public void click_Register()
	{
		Register.click();
	}
	
	public void click_Mobile()
	{
		Mobile.click();
	}
	
	
	
	/*public void mouseoverRing(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(Ring).build().perform();
	
	}*/
		
}
