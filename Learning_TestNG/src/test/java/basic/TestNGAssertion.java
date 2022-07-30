package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class TestNGAssertion {
	
	@Test
	public void test()
	{
		
		
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		assertSame(i1, i2);	
	}
	

	@Test
	public void checkArray()
	{
		int a[] = {10,20,30};
		int b[] = {10,20,40};
		
		assertArrayEquals(a, b);
	}
	

	@Test
	public void assertCheck()
	{
		assertEquals(10, 10);
				//assertNull(null);
				//assertNotNull(null);
	}
}
