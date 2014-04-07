package jquery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Droppable 
{

	Func_Lib obj = new Func_Lib();
	WebDriver cur_dri;
	WebElement cur_ele;
	String value;
	@Test
	public void method_drop()
	{
		
		cur_dri = obj.method_open_bro("firefox", "http://jqueryui.com");
		
		value = obj.method_read_prop("Drop");
						
		obj.method_click_link(cur_dri, value);
						
		cur_dri.switchTo().frame(0);
		
		
		
	}
	
}
