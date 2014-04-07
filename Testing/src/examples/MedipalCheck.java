package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MedipalCheck {

//	WebDriver dri = new FirefoxDriver();
	WebDriver dri; 
	
	@Test
	public void test() throws InterruptedException 
	{
		
		
//		System.setProperty("webdriver.chrome.driver","E:\\SASI\\SELENIUM\\JARs\\chromedriver2_win32_0.8\\chromedriver.exe");
//		dri = new ChromeDriver();
		dri = new FirefoxDriver();
		
		dri.get("https://www.medipal.info/se.novatelligence.medipal.CoordinatorApp/CoordinatorApp.html#1");
		dri.findElement(By.xpath("//*[@id='root-panel-placeholder']/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/input")).sendKeys("deepesh");
		dri.findElement(By.xpath("//*[@id='root-panel-placeholder']/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/input")).sendKeys("welcome");
		dri.findElement(By.xpath(("//*[@id='root-panel-placeholder']/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/button"))).click();
		
		Thread.sleep(5000);
//		dri.findElement(By.xpath("//table[@class='reg-sub-list-button-right-panel']//button")).click();
		dri.findElement(By.xpath("//div[contains(text(),'MEDIPALPLAN')]")).click();

	}

}
