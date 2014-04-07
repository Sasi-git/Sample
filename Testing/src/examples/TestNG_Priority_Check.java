package examples;

import org.testng.annotations.Test;

public class TestNG_Priority_Check 
{

	@Test(priority=2)
	public void method1()
	{
		
		System.out.println("Test 1 executed");
		
	}
	
	@Test(priority=3)
	public void method2()
	{
		
		System.out.println("Test 2 executed");
		
	}
	
	@Test(priority=1)
	public void method3()
	{
		
		System.out.println("Test 3 executed");
		
	}
	
	
}
