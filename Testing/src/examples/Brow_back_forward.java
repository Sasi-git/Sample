package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import examples.Attach_scrshot_Res;;

public class Brow_back_forward 
{
	
	Attach_scrshot_Res act = new Attach_scrshot_Res();
	static WebDriver dri;
	public static void main(String[] args) throws Exception 
	{
		
		dri = new FirefoxDriver();
		dri.get("http://seleniumhq.org/");
		dri.findElement(By.linkText("Download")).click();
		Thread.sleep(3000);            //delay
		dri.navigate().back();
		dri.navigate().forward();
		Thread.sleep(3000);
		
		dri.close();

	}

}
