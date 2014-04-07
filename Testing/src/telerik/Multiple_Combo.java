package telerik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Multiple_Combo 
{

	WebDriver dri;
	
	@Test
	public void method_combo() throws Exception
	{
		
		dri = new FirefoxDriver();
		dri.manage().window().maximize();
		dri.get("http://demos.telerik.com/aspnet-ajax/combobox/examples/functionality/multiplecomboboxes/defaultcs.aspx");
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement arrow1 = dri.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadComboBox1_Arrow']"));
		arrow1.click();
		
		WebElement option1 = dri.findElement(By.xpath("//li[2]"));
		option1.click();
		
		WebElement option2 = dri.findElement(By.xpath("//li[contains(text(),'India')]"));
		WebDriverWait wait = new WebDriverWait(dri,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'India')]")));
		
//		Thread.sleep(5000);
		
		WebElement ele1 = dri.findElement(By.xpath("//input[contains(@id,'RadComboBox2')]"));
		WebDriverWait wait1 = new WebDriverWait(dri,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		
		WebElement arrow2 = dri.findElement(By.xpath("//a[contains(@id,'RadComboBox2')]"));
		arrow2.click();
		
		
		option2.click();
		
		Thread.sleep(5000);
		
		WebElement arrow3 = dri.findElement(By.xpath("//a[contains(@id,'RadComboBox3')]"));
		arrow3.click();
		
		WebElement option3 = dri.findElement(By.xpath("//li[contains(text(),'Bom')]"));
		option3.click();
		
		
		
	}
	
}
