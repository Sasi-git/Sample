package examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Attach_scrshot_Res 
{
	WebDriver dri;
	String URL;
	File scrFile;
	
	@Test
	public void test_scr()
	{
		
		dri = new FirefoxDriver();
		dri.get("http://www.google.com");
		scrFile = ((TakesScreenshot) dri).getScreenshotAs(OutputType.FILE);
	      //Needs Commons IO library
//	      try 
//	      {
////	        FileUtils.copyFile(scrFile, new File(file.getAbsolutePath()+ "/selenium-reports/html/" + result.getName() + ".jpg"));
////	        Reporter.log("<a href='"+ file.getAbsolutePath()+"/selenium-reports/html/" + result.getName() + ".jpg'> <img src='"+ file.getAbsolutePath()+"/selenium-reports/html/"+ result.getName() + ".jpg' height='100' width='100'/> </a>");
//	      } catch (IOException e) {
//	        // TODO Auto-generated catch block
//	        e.printStackTrace();
//	    }
//	    Reporter.setCurrentTestResult(null);
		
		
		try
		{
			FileUtils.copyFile(scrFile, new File("E:\\SASI\\copied.png"));
			URL = "E:\\SASI\\copied.jpg";
			Reporter.log("<a href=" + URL+ ">click to open screenshot</a>");
		}
		catch (IOException e) 
		{
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    Reporter.setCurrentTestResult(null);
		
	}
	
}
