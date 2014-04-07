package testAUTArchive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;


public class BG_Color 
{

	public static void main(String[] args) 
	{
		
		  //Initiate Driver   
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://www.w3.org/Talks/2012/0416-CSS-WWW2012/Demos/transitions/demo-transitions-1.html#no_transition");
		   String text;
		   WebElement WebElement1 = driver.findElement(By.xpath("//li[@id='no_transition']"));
		   text =WebElement1.getCssValue("background-color").toString();
		   System.out.println("color -"+text);
		   
		   //Split css value of rgb
		   String[] numbers = text.replace("rgba(", "").replace(")", "").split(",");
		   int number1=Integer.parseInt(numbers[0]);
		   numbers[1] = numbers[1].trim();
//		   System.out.println("Num 1 - "+numbers[1]);
		   int number2=Integer.parseInt(numbers[1]);
		   numbers[2] = numbers[2].trim();
		   int number3=Integer.parseInt(numbers[2]);
		   String hex = String.format("#%02x%02x%02x", number1,number2,number3);
		   System.out.println(hex);

		}
	
}
