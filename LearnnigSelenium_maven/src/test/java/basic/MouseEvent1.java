package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utill.Driverconnection;

public class MouseEvent1 {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
		
		Actions builder = new Actions(driver);
		
		Action drag =  builder.clickAndHold(from)
				.moveToElement(to)
				.release()
				.build();
				
		drag.perform();
		
	}
}
