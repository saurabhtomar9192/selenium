package qaclickacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {
	private static final String OutputType = null;
	private static final String File = null;
	private static final String TakesScreenshot = null;
	WebDriver driver;
	Properties p;

public WebDriver intializebrowser() throws Exception
{
	
	 p = new Properties();
	
	FileInputStream f =new FileInputStream("C:\\Users\\Saurabh\\Mavenjava\\src\\main\\java\\qaclickacademy\\data.properties");
	
	p.load(f);
	
	String browsername =p.getProperty("Browser");
	
	System.out.println(browsername);
	
	if(browsername.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

return driver;


}
//public void getscreenshot()
//{
//	((TakesScreenshot)driver).getScreenshotAs(OutputType.f);
//}
}