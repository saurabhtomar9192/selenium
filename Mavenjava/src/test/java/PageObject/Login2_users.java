package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2_users {
	
	public WebDriver driver;
	
	
	//By signin =By.xpath("//*[@id='nav-link-accountList']");
	By email =By.xpath("//*[@id='ap_email']");
	By password =By.xpath("//*[@id='ap_password']");
	By logon =By.xpath("//*[@id='signInSubmit']");
	
	
	
	
		public Login2_users(WebDriver driver) 
		{
		this.driver=driver;
	}


		public WebElement email() throws InterruptedException
		
		{
			//Thread.sleep(20000);
			
			return driver.findElement(email);
			
			
		}
		
	public WebElement password() throws InterruptedException
		
		{
			//Thread.sleep(20000);
			
			return driver.findElement(password);
			
			
		}
	
	public WebElement loginn() throws InterruptedException
	
	{
		//Thread.sleep(20000);
		
		return driver.findElement(logon);
		
		
	}
	
	
	
	
	
	

}
