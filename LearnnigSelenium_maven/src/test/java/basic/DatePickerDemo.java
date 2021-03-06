package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class DatePickerDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		String myDate = "12";
		String myMonth = "August";
		String myYear = "2012";
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		
		driver.findElement(By.id("datepicker")).click();
		
		String year =  driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(driver.findElement(By.className("ui-datepicker-year")).getText()).equals(myYear))
		{
			if(Integer.parseInt(year)<Integer.parseInt(myYear))
			{
				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();
				while(!(driver.findElement(By.className("ui-datepicker-month")).getText()).equals(myMonth))
				{
					driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();
				}
			}
			else
			{
				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
				while(!(driver.findElement(By.className("ui-datepicker-month")).getText()).equals(myMonth))
				{
					driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
				}
			}
				
		}
		
		
		
		
		
		
		List<WebElement> data = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement d : data)
		{
			if(d.getText().equals(myDate))
			{
				d.click();
				break;
			}
		}
		
		
	}
}
