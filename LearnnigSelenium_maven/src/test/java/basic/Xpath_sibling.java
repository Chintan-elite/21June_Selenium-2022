package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class Xpath_sibling {
	public static void main(String[] args) {
		
		
		WebDriver driver =Driverconnection.getdriver();
		driver.get("https://demoqa.com/webtables");
		
		
		String name = "Cierra";
		WebElement fname = driver.findElement(By.xpath("//*[text()='"+name+"']")); 
		
		if(fname.isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
		}
		
		
	}
}
