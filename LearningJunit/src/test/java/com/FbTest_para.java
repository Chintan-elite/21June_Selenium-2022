package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

@RunWith(Parameterized.class)
public class FbTest_para {

	String username;
	String password;

	public FbTest_para(String username, String password) {

		this.username = username;
		this.password = password;
	}

	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void loginCheck()
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

	@Parameters
	public static List<Object[]> getData() {
		Object obj[][] = new Object[3][2];

		obj[0][0] = "topsaxt@gmail.com";
		obj[0][1] = "12345";

		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech123";

		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";

		return Arrays.asList(obj);
	}

}
