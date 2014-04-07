package examples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop_down {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		WebElement element = driver.findElement(By.name("selectedCustomer"));
		Select dd= new Select(element);
		List allOptions= dd.getOptions();  

		//To go through the list, we can use an Iterator. 
		//Iterator should be of the same type as the List
		//which is WebElement in this case.  

		Iterator it = allOptions.iterator();
		//Using while loop, we can iterate till the List has 
		//a next WebElement [hasNext() is true]
		//number of items in the list
		System.out.println(allOptions.size());

		while(it.hasNext()){
		//When you say it.next(), it points to a particular
		//WebElement in the List.
		WebElement el = (WebElement) it.next();
		 //Check for the required element by Text and click it
		if(el.getText().equals("mango")){
		  System.out.println(el.getAttribute("value"));
		   el.click();    
		 }
		} 

	}

}
