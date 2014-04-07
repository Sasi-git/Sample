package frame_custom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.opera.core.systems.OperaDriver;

public class Opera_Test 
{

	WebDriver dri;
	
	@Test
	public void opera_testing()
	{
		
		dri = new OperaDriver();
		dri.get("http://jqueryui.com");
		
		
	}
	
}
