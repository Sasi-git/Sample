package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JS_Testing 
{

	WebDriver dri;
	
	@Test
	public void testing_JS()
	{
		
		dri = new FirefoxDriver();
		dri.get("http://www.google.com");
//		String ti = dri.getTitle();
//		System.out.println("title - "+ti);
		
		//Displays an alert message
		JavascriptExecutor js = (JavascriptExecutor) dri;
		js.executeScript("alert('Hai! This is an Alert msg');");
		Alert alt = dri.switchTo().alert();
		alt.accept();
		
		//Gets the title of the page
		String title = (String) js.executeScript("return document.title");
		System.out.println("title  : " + title);
		
		//Gets the domain name
		String domain = (String) js.executeScript("return document.domain");
		System.out.println("domain  : " + domain);
		
		//Gets the URL
		String URL = (String) js.executeScript("return document.URL");
		System.out.println("Full URL  : " + URL);
		
		//Gets the attribute of an element
		Object exampleDiv = ((JavascriptExecutor) dri).executeScript("return document.getElementById('main');");
		String name = ((WebElement) exampleDiv).getAttribute("class");
		System.out.println(name);
		
		//Gets the last modified
		String lastModified = (String) js.executeScript("return document.lastModified");
		System.out.println("lastModified  : " + lastModified);
		
		//Gets the ready state
		String readyState = (String) js.executeScript("return document.readyState");
		System.out.println("readyState  : " + readyState);
		
		dri.quit();
		
		/*
		 *Clicks on an element using JS
		   	WebElement element = driver.findElement(By.id("Value"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);

OR |

			WebElement element = driver.findElement(By.id("Value"));
			trigger("arguments[0].click();", element);

			public void trigger(String script, WebElement element) {
			((JavascriptExecutor) driver).executeScript(script, element);
			}

OR |

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.document.getElementById('Value').click()");
		 */
		
	}
	
}
