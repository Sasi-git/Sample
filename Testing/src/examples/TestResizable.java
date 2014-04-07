package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		
		Thread.sleep(3000);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		  
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 400, 200).perform();
		
		System.out.println("Element has been resized successfully");
		
		driver.close();

	}

}
