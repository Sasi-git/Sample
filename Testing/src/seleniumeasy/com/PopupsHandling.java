package seleniumeasy.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopupsHandling 
{

	WebDriver driver=new FirefoxDriver();

	@Test
	public void ExampleForPromptBox() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.get("file:///E:/sasi/Prompt_Pop.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Sasi");
		System.out.println(alert.getText());
		alert.accept();
//		System.out.println(alert.getText());
		driver.quit();

	}

}