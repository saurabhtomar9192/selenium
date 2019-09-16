package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Actionc {

WebDriver driver;

public  Actions acTionuse()
{
driver=new ChromeDriver();
Actions action=new Actions(driver);


return action;



}	
	
	

}
