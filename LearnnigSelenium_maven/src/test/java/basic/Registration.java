package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utill.Driverconnection;

public class Registration {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("tops");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("9586746352");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tech#123");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select days = new Select(day);
		Select months = new Select(month);
		Select years = new Select(year);
		
		
		days.selectByIndex(9);
		months.selectByVisibleText("Aug");
		years.selectByValue("2020");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
//		for(WebElement g : gender)
//		{
//			System.out.println(g.getAttribute("value"));
//		}
		gender.get(1).click();
	
		driver.findElement(By.name("websubmit")).click();
	}
	
}
