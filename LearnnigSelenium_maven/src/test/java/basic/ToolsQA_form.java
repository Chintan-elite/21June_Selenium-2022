package basic;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utill.Driverconnection;

public class ToolsQA_form {
	
		public static void main(String[] args) {
			
			WebDriver driver = Driverconnection.getdriver();
			driver.get("https://demoqa.com/automation-practice-form");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			driver.findElement(By.id("firstName")).sendKeys("Tops");
			driver.findElement(By.id("lastName")).sendKeys("Tech");
			driver.findElement(By.id("userEmail")).sendKeys("tops@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
			driver.findElement(By.id("userNumber")).sendKeys("9865635241");
			driver.findElement(By.id("dateOfBirthInput")).click();
		
			String myDate = "30";
			String myMonth = "May";
			String myYear = "2000";
		
			WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
			Select months = new Select(month);
			months.selectByVisibleText(myMonth);
			
			WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
			Select years = new Select(year);
			years.selectByVisibleText(myYear);
			
			List<WebElement> dates = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
			for(WebElement date : dates)
			{
				//System.out.println(date.getText());
				if(date.getText().equals(myDate))
				{
					if(date.getAttribute("aria-label").contains(myMonth))
					{
						date.click();
						break;
					}
					
				}
			}
			
			WebElement subject = driver.findElement(By.id("subjectsContainer"));
			Actions builder = new Actions(driver);
			
			builder.click(subject)
					.sendKeys("Maths")
					.sendKeys(Keys.ENTER)
					.build()
					.perform();
			
			driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
			
			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chintan\\Desktop\\logo-tops.png");
			
			driver.findElement(By.id("currentAddress")).sendKeys("Surat,gujarat");
			
		
		}
	
}
