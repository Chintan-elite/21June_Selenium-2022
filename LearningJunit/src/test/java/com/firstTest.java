package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class firstTest {
	
	@Test
	public void test1()
	{
		System.out.println("running test1");
	}
	
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Test
	public void tes3()
	{
		System.out.println("running test3");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("runningbefore every test..");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("running after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("running before class....");
	}
	
	@AfterClass
	public static void afteClass()
	{
		System.out.println("running after class");
	}
}
