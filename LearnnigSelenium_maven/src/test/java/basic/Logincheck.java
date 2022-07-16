package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class Logincheck {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement email =  driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.clear();
		email.sendKeys("Tops@gmail.com");
		pass.clear();
		pass.sendKeys("xyz123");
		login.click();
		
		
		
		
		
		
	}
}
