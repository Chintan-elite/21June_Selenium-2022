package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Calc_para {
	
	int a;
	int b;
	int result;
	
	public Calc_para(int a, int b, int result) {
		
		this.a = a;
		this.b = b;
		this.result = result;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		assertEquals(result, c.add(a, b));
	}
	
	
	@Parameters
	public static List<Object[]> getdata()
	{
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 20;
		obj[0][1] = 50;
		obj[0][2] = 70;
		
		obj[1][0] = 200;
		obj[1][1] = 500;
		obj[1][2] = 700;
		
		obj[2][0] = 20;
		obj[2][1] = 250;
		obj[2][2] = 270;
		
		obj[3][0] = 200;
		obj[3][1] = 50;
		obj[3][2] = 70;
		
		return Arrays.asList(obj);
		
		
	}
}
