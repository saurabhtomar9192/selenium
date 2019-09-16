package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainHomepage {

	WebDriver driver;
	
	By searchboxa=By.xpath("//*[@id='twotabsearchtextbox']");
	
	By signindrop=By.xpath("//*[@id='nav-link-accountList']");
	
		
	public MainHomepage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public WebElement searchbox()
	{
		return driver.findElement(searchboxa);
		
		
	}
	public WebElement signindr()
	{
		return driver.findElement(signindrop);
		
		
	}
}
