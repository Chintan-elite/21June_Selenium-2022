package methodtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Account {
	
	@Test
	public void saving()
	{
		System.out.println("Runing saving account test");
	}
	
	@Test(groups = "sanity")
	public void current()
	{
		System.out.println("runing current account");
	}
	
	@Test(groups = { "smoke","sanity"})
	public void loan()
	{
		System.out.println("runiong loan account");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("runningbefore every account class method...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("running after every account method...");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running before account class");
	}
		
	@AfterClass
	public void afterClass()
	{
		System.out.println("Running after account class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("running before test...");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("running after test...");
	}
	
}
