package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class PracticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://uat.gfacility.com/login?redirectUrl=%2Fhome");
		
		driver.findElement(By.xpath("//form/div[1]/dx-text-box/div/div[1]/input")).sendKeys("Tops");
		driver.findElement(By.xpath("//form/div[2]/dx-text-box/div/div[1]/input")).sendKeys("Tech");

		
	}
}
