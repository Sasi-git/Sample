package seleniumeasy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class IFrame
{

	@Test

	public  void open() throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipcart.com");
		Thread.sleep(3000);
		driver.findElement(By.id("webklipper-publisher-widget-container-content-expand-collapse")).click();
		Thread.sleep(10000);
		driver.switchTo().frame("webklipper-publisher-widget-container-frame");
		driver.findElement(By.id("field_email_EMAIL")).sendKeys("this is test");
		driver.switchTo().defaultContent();
		
	}

}
