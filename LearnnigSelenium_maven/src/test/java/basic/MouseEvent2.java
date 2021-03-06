package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.Driverconnection;

public class MouseEvent2 {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement from =  driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(from)
			.moveToElement(to)
			.build()
			.perform();
		
		
		
	}
}
