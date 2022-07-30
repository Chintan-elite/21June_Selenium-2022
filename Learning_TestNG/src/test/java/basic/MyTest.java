package basic;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test(priority = 3)
	public void test1()
	{
		System.out.println("runing test 1...");
	}
	
	@Test(priority = 1,enabled = false)
	public void beta()
	{
		System.out.println("running beta test...");
	}
	
	@Test(priority = 2)
	public void alpha()
	{
		System.out.println("runing alpha test");
	}
	
	
}
