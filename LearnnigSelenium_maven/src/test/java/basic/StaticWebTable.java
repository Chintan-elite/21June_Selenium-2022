package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class StaticWebTable {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement currency = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		System.out.println(currency.getText());
		
		
	}
}
