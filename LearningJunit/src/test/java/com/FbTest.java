package com;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class FbTest {
	
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser()
	{
		driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void titleCheck()
	{
		
		
		assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	@Test
	public void loginCheck()
	{
		
		driver.findElement(By.id("email")).sendKeys("tops");
		driver.findElement(By.id("pass")).sendKeys("25698000");
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Log in to Facebook", driver.getTitle());
	
	}
	
	@AfterClass
	public static void close()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
