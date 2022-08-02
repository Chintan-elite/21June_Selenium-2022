package methodtest;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(groups = "smoke")
	public void creditCard()
	{
		System.out.println("Credit card payment");
	}
	
	@Test
	public void debitcard()
	{
		System.out.println("Debit card payment...");
	}
	
	@Test(groups ="sanity" )
	public void cod()
	{
		System.out.println("cod payment");
	}
}
