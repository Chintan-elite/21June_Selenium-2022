package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class ScreenShotDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("http://topshrms.in/");
		
		TakeScreenShot.getScreenShot(driver,"D:\\topsgit\\home.png");
		
		driver.findElement(By.id("l_username")).sendKeys("tops");
		driver.findElement(By.id("l_password")).sendKeys("tops123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		TakeScreenShot.getScreenShot(driver,"D:\\topsgit\\login.png");
		
		
	}
}
