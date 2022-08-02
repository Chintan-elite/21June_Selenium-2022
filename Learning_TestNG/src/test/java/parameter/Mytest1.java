package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class Mytest1 {
	
	@Parameters({"uname","pass"})
	@Test
	public void loginTest(String username, String password)
	{
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
	}
}
