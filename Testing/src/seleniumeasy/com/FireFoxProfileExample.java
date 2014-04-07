package seleniumeasy.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;


public class FireFoxProfileExample 
{

	WebDriver driver;

	@Test
	public void testExamples() throws Exception
	{

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage","http://www.google.com");
		driver = new FirefoxDriver(profile);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("100");
		Thread.sleep(5000);
	}
}