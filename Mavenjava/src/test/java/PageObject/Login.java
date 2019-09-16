package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	
	By signin =By.xpath("//*[@id='nav-link-accountList']");
	
	
	
	
		public Login(WebDriver driver) 
		{
		this.driver=driver;
	}


		public WebElement getlogin() throws InterruptedException
		
		{
			Thread.sleep(10000);
			
			return driver.findElement(signin);
			
		}
	
	
	
	

}
