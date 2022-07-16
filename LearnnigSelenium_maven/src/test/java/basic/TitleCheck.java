package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utill.Driverconnection;

public class TitleCheck {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://topsint.com/topserp/index.php");
		
		String expectedTitle = "Tops ERP";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Passed !!!");
		}
		else
		{
			System.out.println("Failed!!!");
		}
		
		driver.close();  //To close prticular tab
		//driver.quit(); //to close browser / all windows
		
		
	}
}
