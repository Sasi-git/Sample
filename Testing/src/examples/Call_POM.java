package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Call_POM 
{

	POM_Test page_obj = new POM_Test();
	WebDriver cur_dri;
	
	@Test
	public void get_page()
	{
		
		cur_dri = page_obj.test_page();
//		cur_dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cur_dri.findElement(By.linkText("Droppable"));
		cur_dri.quit();
		
	}
	
}
