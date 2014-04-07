package seleniumeasy.com;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Add_Cookies_Test 
{

	WebDriver driver;
	
	@Test
	public void addCookie()
	{

		driver= new FirefoxDriver();
		String URL="http://flipcart.com";
		driver.navigate().to(URL);

                //we should pass name and value for cookie as parameters

                // In this example we are passing, name=mycookie and value=123456789123

		Cookie name = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(name);


                // After adding the cookie we will check that by displaying all the cookies.

		Set<Cookie> cookiesList =  driver.manage().getCookies();

		for(Cookie getcookies :cookiesList) 
		{

		    System.out.println(getcookies );

		}

	}
	
}
