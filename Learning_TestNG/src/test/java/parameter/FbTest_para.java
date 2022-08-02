package parameter;



import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utill.Driverconnection;


public class FbTest_para {

	
	

	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
	}

	@Test(dataProvider = "dp")
	public void loginCheck(String username, String password)
	{
		
		WebElement user =  driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(username);
		WebElement pass =  driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		  try 
		  { Thread.sleep(5000); }
		  catch (InterruptedException e) 
		  { 
			    e.printStackTrace(); 
		  }
		  assertEquals("Log in to Facebook", driver.getTitle());
		 
		  driver.navigate().back();
	}

	@AfterClass
	public static void close() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	@DataProvider(name = "dp")
	public static Object[][] getData() {
		Object obj[][] = new Object[3][2];

		obj[0][0] = "topsaxt@gmail.com";
		obj[0][1] = "12345";

		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech123";

		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";

		return obj;
	}

}
