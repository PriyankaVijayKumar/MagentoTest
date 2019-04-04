

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		
		this.driver = driver;
		
	}
     By email= By.id("email");
     By pwd=By.id("pass");
     By login = By.id("send2");
	public void typeEmail() 
	{
		driver.findElement(email).sendKeys("priyankavijaykumar555@gmail.com");		
	}
	public void typepassword() 
	{
		driver.findElement(pwd).sendKeys("Welcome123");
		
	}
	public void clickOnLogin()
	{
		
		driver.findElement(login).click();
		
	}

	

}