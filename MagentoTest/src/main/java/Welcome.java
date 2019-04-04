

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome 
{
	WebDriver driver;
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	
	}
    By myacct = By.linkText("My Account");
	
	public void clickOnMyaccount()
	{
		driver.findElement(myacct).click();
	}
		
	
}
