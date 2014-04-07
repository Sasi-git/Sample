package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Highlight_ele 
{
	
	static WebDriver dri;
		
	public static void main(String[] args) 
	{
	
		dri = new FirefoxDriver();
		dri.get("http://jqueryui.com/draggable/");
		dri.manage().window().maximize();
		WebElement ele = dri.findElement(By.xpath("//div[@id='sidebar']//a"));
		
		HighlightElement(ele);
		
		System.out.println("Completed");
		
//		dri.quit();

	}
	
	public static void HighlightElement(WebElement element)
    {
//        for (int i = 0; i < 2; i++)
//        {
            JavascriptExecutor js = (JavascriptExecutor)dri;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: yellow; border: 2px solid yellow;");
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "border: 5px solid yellow;");
            System.out.println("Entered into func");
//        }
    }
	
	
}
