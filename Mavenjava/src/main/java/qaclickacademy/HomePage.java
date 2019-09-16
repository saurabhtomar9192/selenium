package qaclickacademy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.Login;
import PageObject.Login2_users;
import PageObject.MainHomepage;

public class HomePage extends Basic {
	//@Parameters({"name"})
		//@Test(dataProvider="getdata")
	@Test
		//public void intialize(String s,String m) throws Exception
	public void intialize() throws Exception
		{
		driver = intializebrowser();
		String amazonurl =p.getProperty("url");
		
		driver.get(amazonurl);
		driver.manage().window().maximize();
		//System.out.println(s);
		//System.out.println(m);
	
		
		
		
//		driver.findElement(By.xpath("//*[text()='Terms']")).click();
//		System.out.println(driver.getTitle());
//		Set<String> st= driver.getWindowHandles();
//		Iterator<String> it=st.iterator();
//		String gmail=it.next();
//		String Terms=it.next();
//		driver.switchTo().window(Terms);
//		System.out.println(driver.getTitle());
		
//		driver.findElement(By.xpath("//*[contains(text(),'Droppable')]")).click();
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'demo')]")));
//		
//		driver.findElement(By.xpath("//*[contains(@id,'draggable')]")).getText();
//		
//		 //WebElement drg = driver.findElement(By.xpath("//*[contains(@id,'draggable')]"));
//		 
////		 WebElement drp = driver.findElement(By.xpath("//*[contains(@id,'droppable')]"));
////		 
//		 Actions a=new Actions(driver);
////		 
//		 a.dragAndDrop(driver.findElement(By.xpath("//*[contains(@id,'draggable')]")), driver.findElement(By.xpath("//*[contains(@id,'droppable')]"))).build().perform();
//		
		
		}
	
	
	
	
	@Test(groups="smoke",dependsOnMethods="intialize")
	public void homepage1 () throws Exception{
		
		
		
		
		Login l = new Login(driver);
		

		l.getlogin().click();
		
		Login2_users lu =new Login2_users(driver);
		
		lu.email().sendKeys("7411570476");
		lu.password().sendKeys("9897994993");
		lu.loginn().click();
		
	Select s=new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> we=s.getOptions();
	for(WebElement sa:we)
	{
		System.out.println(sa.getText());
	}
	
//s.selectByVisibleText("Baby");
	
		
		//lu.email().getAttribute("name");
		System.out.println(lu.email().getAttribute("value"));
		System.out.println(lu.email().getText());
	}}
		
//		MainHomepage m=new MainHomepage(driver);
//		Actions a=new Actions(driver);
//		a.moveToElement(m.searchbox()).click().keyDown(Keys.SHIFT).sendKeys("bedsheets").build().perform();;
//		lu.email().getAttribute(null);
//		lu.email().getText();
	//}
	
	
	
//	@AfterTest
//	
//	public void closebrowser()
//	{
//		driver.close();
//	}
	

//@DataProvider
//public Object[][] getdata()
//{Object [][] data=new Object[3][2];
//
//data[0][0]="saurabh";
//data[0][1]="Tomar";
//
//data[1][0]="Ankush";
//data[1][1]="ank";
//
//data[2][0]="ddd";
//data[2][1]="Tomafffr";
//	return data;
//	
//}
//
//}


