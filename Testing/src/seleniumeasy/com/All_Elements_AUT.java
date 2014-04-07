package seleniumeasy.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class All_Elements_AUT 
{
	
	WebDriver dri;
	
	@BeforeMethod
	public void start()
	{
		
		dri = new FirefoxDriver();
		dri.get("http://seleniumeasy.com/selenium-tutorials/basic-html-elements-used-in-automation");
		
	}
	
	@Test
	public void testMethod() throws InterruptedException
	{
		
		WebElement ele1 = dri.findElement(By.name("email"));//Finds using name locator
		ele1.sendKeys("QA@test.com");
		
		WebElement ele2 = dri.findElement(By.xpath("//input[@name='mobile']"));
		ele2.sendKeys("123456789");
		
		WebElement ele3 = dri.findElement(By.cssSelector("input[name=telephone]"));
		ele3.sendKeys("555555");
		
		WebElement ele4 = dri.findElement(By.xpath("//textarea"));
		ele4.clear();
		ele4.sendKeys("Cleared and Entered text in textarea successfully");
		
		WebElement ele5 = dri.findElement(By.xpath("//input[@type='checkbox' and @value='soccer']"));
		ele5.click();
		
		WebElement ele6 = dri.findElement(By.cssSelector("input[type=checkbox][value=hocky]"));
		ele6.click();
		
		WebElement ele7 = dri.findElement(By.name("devices"));
		Select sel = new Select(ele7);
		sel.selectByVisibleText("IPad");
		
		WebElement ele8 = dri.findElement(By.xpath("//p[contains(text(),'alert')]/following::button"));
		ele8.click();
		Alert alt = dri.switchTo().alert();
		alt.accept();
		
//		WebElement ele9 = dri.findElement(By.cssSelector("p:contains('confirm') + p>button"));
		WebElement ele9 = dri.findElement(By.xpath("//p[contains(text(),'confirm')]/following::button"));
		ele9.click();
//		Thread.sleep(3000);
		Alert alt1 = dri.switchTo().alert();
		alt1.accept();
		WebElement chk1 = dri.findElement(By.xpath("//p[contains(text(),'confirm')]/following::button/following::p"));
		String actual_val = chk1.getText().toString();
		String exp_val = "You Clicked on OK!";
		
		if(actual_val.equals(exp_val))
		{
			
			System.out.println("Clicked on OK msg appears");
			
		}
		
		ele9.click();
//		Thread.sleep(3000);
		Alert alt2 = dri.switchTo().alert();
		alt2.dismiss();
		
		WebElement chk2 = dri.findElement(By.xpath("//p[contains(text(),'confirm')]/following::button/following::p"));
		String actual_val1 = chk2.getText().toString();
		String exp_val1 = "You Clicked on Cancel!";
		
		if(actual_val1.equals(exp_val1))
		{
			
			System.out.println("Clicked on CANCEL msg appears");
			
		}
		
		WebElement ele10 = dri.findElement(By.xpath("//p[contains(text(),'prompt')]/following::button"));
		ele10.click();
		
//		Thread.sleep(5000);
		
		Alert alt3 = dri.switchTo().alert();
		alt3.sendKeys("SASI");
		alt3.accept();		
		
		WebElement chk3 = dri.findElement(By.xpath("//p[contains(text(),'prompt')]/following::button/following::p"));
		String actual_val2 = chk3.getText().toString();
		String exp_val2 = "SASI";
		
		System.out.println(actual_val2);
//		System.out.println(exp_val2);
		
		if(actual_val2.contains(exp_val2))
		{
			
			System.out.println("Given text is shown");
			
		}
		
		ele10.click();
		Alert alt4 = dri.switchTo().alert();
//		Thread.sleep(5000);
		alt4.dismiss();
		
	}
	
	@AfterMethod
	public void exit()
	{
		
		dri.quit();
		
	}
}
