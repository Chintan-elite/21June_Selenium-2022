package methodtest;

import org.testng.annotations.Test;

public class Account {
	
	@Test
	public void saving()
	{
		System.out.println("Runing saving account test");
	}
	
	@Test
	public void current()
	{
		System.out.println("runing current account");
	}
	
	@Test
	public void loan()
	{
		System.out.println("runiong loan account");
	}
}
