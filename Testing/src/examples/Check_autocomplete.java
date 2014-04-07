package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Check_autocomplete 
{
	
	WebDriver dri;
	Attach_scrshot_Res res = new Attach_scrshot_Res();

	@Test
	public void testing_auto() throws InterruptedException
	{
		
		dri = new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		dri.get("https://www.blueshieldca.com/fap/app/search.html");
		
		WebElement ele = dri.findElement(By.id("location"));
		ele.click();
		ele.sendKeys("los");
//		Thread.sleep(2000);
		dri.findElement(By.linkText("Los Alamitos Junction, Orange, CA")).click();
		
		res.test_scr();
		
	}
	
}
