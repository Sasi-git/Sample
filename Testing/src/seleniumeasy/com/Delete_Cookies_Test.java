package seleniumeasy.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Delete_Cookies_Test 
{
	
	WebDriver driver;

	@Test
	public void deleteCookieNamedExample()
	{

		driver= new FirefoxDriver();
		String URL="http://flipcart.com";
		driver.navigate().to(URL);
		driver.manage().deleteCookieNamed("__utmb");

	}
	
	@Test
	public void deleteAllCookiesExample()
	{

		driver= new FirefoxDriver();
		String URL="http://flipcart.com";
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();

	}
	
}
