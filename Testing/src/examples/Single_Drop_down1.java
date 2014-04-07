package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop_down1 {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver = new FirefoxDriver();
		WebElement customerdd = driver.findElement(By.name("customerProject.shownCustomer"));
		  //convert the element to select object
		  Select cust = new Select(customerdd);
		  cust.selectByIndex(1);                                       //Select by Index
		  Thread.sleep(3000);
		  cust.selectByValue("2");                                   //Select by Value
		  Thread.sleep(3000);
		  cust.selectByVisibleText("mango");                //Select by Visible Text

	}

}
