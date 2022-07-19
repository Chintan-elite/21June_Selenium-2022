package basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.Driverconnection;

public class AlertBox {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://demoqa.com/alerts");
		
		
		driver.findElement(By.id("alertButton")).click();
		
		//driver.findElement(By.id("timerAlertButton")).click();
		
		//explicite wait
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		/*
		 * if(wait.until(ExpectedConditions.alertIsPresent())==null) {
		 * System.out.println("Not present"); } else { System.out.println("present"); }
		 */
		
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		
		TakeScreenShot.getScreenShot(driver,"D:\\topsgit\\alert.png");
		
		
		alert.accept();
		
	}
}
