package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

	
	@Test
	public void TestMissingNumber() {
		
		int[] a= {1, 2, 4, 6, 3, 7, 8};
		int n = 7;
		MissingNumber mn = new MissingNumber();
		int expectedOutput = 5;
		int methodOutput = mn.getMissingNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void ZeroesAtEnd() {
		
		int[] a= {1, 2, 0, 4, 3, 0, 5, 0};
		int n = 8;
		ZeroesAtEnd l3 = new ZeroesAtEnd(a,n);
		int[] expectedOutput = {1, 2, 4, 3, 5, 0, 0, 0};
		int[] methodOutput = l3.zeroAtEnd(a,n);
		
		Assert.assertArrayEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void testMissingNumber1()  {
		MissingNumber mn = new MissingNumber();
	       Assert.assertTrue(mn.getN() <= 10);
	       Assert.assertFalse(mn.getN() > 10);
	       
	    }
	
	@Test
	public void testLargest3()  {
		Largest3 l3 = new Largest3();
	       Assert.assertTrue(l3.getN() <= 10);
	       Assert.assertFalse(l3.getN() > 10);
	       
	    }
	
}
