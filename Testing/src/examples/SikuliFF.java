package examples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sikuli.webdriver.ImageElement;
import org.sikuli.webdriver.SikuliFirefoxDriver;
import org.testng.annotations.Test;


public class SikuliFF 
{

	SikuliFirefoxDriver driver; 
	
	@Test(enabled = false)
	public void test_sikuli() throws IOException 
	{				
        
		driver = new SikuliFirefoxDriver();
		
        // visit Google Map
        driver.get("https://maps.google.com/");
        
        // enter "Denver, CO" as search terms
        WebElement input = driver.findElement(By.id("gbqfq"));
        input.sendKeys("Denver, CO");           
        input.sendKeys(Keys.ENTER);

        ImageElement image;
        
        // find and click on the image of the lakewood area
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/lakewood.png"));
        HighlightElement(image);
        image.doubleClick();               
        
        // find and click on the image of the kendrick lake area
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/kendrick_lake.png"));
        image.doubleClick();

        // find and click the Satellite icon to switch to the satellite view
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/satellite.png"));             
        image.click();

        // find and click the plus button to zoom in
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/plus.png"));
        image.click();
        
        // find and click the link button
        WebElement linkButton = driver.findElement(By.id("link"));
        linkButton.click();

	}

	public void HighlightElement(ImageElement element)
    {
            
			JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: yellow; border: 2px solid yellow;");
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "border: 5px solid yellow;");
            System.out.println("Entered into func");

    }

	@Test
	public void test_def() throws MalformedURLException
	{
		
		driver = new SikuliFirefoxDriver();
		driver.get("http://code.google.com");
		ImageElement image1 = driver.findImageElement(new URL("http://code.google.com/images/code_logo.gif"));
//		HighlightElement(image1);
		image1.click();
		
//		ImageElement image2 = driver.findImageElement(new URL("http://code.google.com/images/gd-logo.png"));
		
	}

}
