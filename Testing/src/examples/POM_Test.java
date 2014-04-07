package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_Test 
{

	WebDriver dri = new FirefoxDriver();
	
	public WebDriver test_page()
	{
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dri.get("http://jqueryui.com/");
		WebElement ele = dri.findElement(By.linkText("Draggable"));
		ele.click();
//		WebElement ele1 = dri.findElement(By.id("draggable"));
		
		return dri;
		
	}
	
}
