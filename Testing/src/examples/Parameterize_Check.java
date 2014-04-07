package examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize_Check 
{

	@Test
	@Parameters(value="number")
	public void parameterIntTest(int number) 
	{
	
		System.out.println("Parameterized Number is : " + number);
		
	}
	
}
