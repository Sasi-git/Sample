package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutomComplete 
{

	Func_Lib obj = new Func_Lib();
	@Test
	public void method_auto() throws InterruptedException
	{
		
		obj.method_open_bro("firefox", "http://jqueryui.com");
		obj.dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj.method_click_link(obj.dri, "Autocomplete");
		obj.dri.switchTo().frame(0);
		WebElement auto_box = obj.dri.findElement(By.id("tags"));
		auto_box.click();
		auto_box.sendKeys("a");
//		Thread.sleep(1000);
		obj.method_click_link(obj.dri, "ActionScript");
		
	}
	
}
