package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.Driverconnection;

public class MultipleWindowHandling {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		
		String mainWin =  driver.getWindowHandle();
		System.out.println("Mainwin : "+mainWin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> wins = driver.getWindowHandles();
		for(String win : wins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			}
		}
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
		
	}
}
