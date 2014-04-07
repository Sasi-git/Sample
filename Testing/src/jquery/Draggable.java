package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Draggable 
{
	
	Func_Lib obj = new Func_Lib();
	@Test
	public void method_entry() throws InterruptedException
	{
		
		obj.method_open_bro("firefox", "http://jqueryui.com");
		obj.method_click_link(obj.dri, "Draggable");
//		obj.method_click_link(obj.dri, "Droppable");
//		Thread.sleep(3000);
		obj.dri.switchTo().frame(0);
		WebElement drag = obj.dri.findElement(By.id("draggable"));
		Actions act = new Actions(obj.dri);
		act.dragAndDropBy(drag, 200, 50).perform();
		Thread.sleep(5000);
		System.out.println("Going to close the bro");
		obj.method_close();
//		obj.dri.close();
		System.out.println("Completed");
		
	}
	
}
