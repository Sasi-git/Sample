package mkyoung.com;

import org.testng.annotations.Test;

public class TestRuntime {
	 
	@Test(expectedExceptions = ArithmeticException.class)
//	@Test
	public void divisionWithException() {
		System.out.println("Before exception");
		int i = 1 / 0;
		System.out.println("Value is - "+i);
	}
 
}