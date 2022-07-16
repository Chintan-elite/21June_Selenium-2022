package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class Dynamicwebtable {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getdriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
			for(int j=1;j<cols.size();j++)
			{
				WebElement data =  driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(data.getText());
			}
		}
		
	}
}
