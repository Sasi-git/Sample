package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ericbieller.com/examples/dragdrop/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Starting"); 
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//div[@id='items']/div[1]"));
		WebElement des = driver.findElement(By.id("trash"));
		System.out.println("Found Elements"); 
		act.clickAndHold(src).build().perform();                //For each action we need to build and Perform
		act.moveToElement(des).build().perform();
		act.release(des).build().perform();
		System.out.println("Finish");

	}

}
