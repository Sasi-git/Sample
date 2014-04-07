package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		  
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/a"));
		  
		Actions action = new Actions(driver);
//		Thread.sleep(3000);
		action.dragAndDropBy(slider, 690, 0).perform();
		
		System.out.println("Slider has been moved successfully");
		
		driver.close();

	}

}
