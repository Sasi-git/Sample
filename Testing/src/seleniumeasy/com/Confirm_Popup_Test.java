package seleniumeasy.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Confirm_Popup_Test 
{
	
	WebDriver driver=new FirefoxDriver();

	@Test
	public void ExampleForConfirmBox() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.get("file:///E:/SASI/Confirm_Pop.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		driver.quit();
	
	}
	
}
