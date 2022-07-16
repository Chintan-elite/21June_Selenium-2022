package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class Amazone {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']/a")).click();
		
		
	}
}
