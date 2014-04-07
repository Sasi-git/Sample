package jquery;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakeScreenshot 
{
	WebDriver driver;
	
	@Test
	public void testing() 
	{
		
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     try {
	    	 	FileUtils.copyFile(scrFile, new File("E:\\SASI\\test.jpg"));
	     	 } catch (IOException e) 
	     	 {
	     		 e.printStackTrace();
	     	 }
	}
}
