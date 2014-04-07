package jquery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Func_Lib 
{
		WebDriver dri;
		WebElement ele;
		String Key_Value;
		
		public WebDriver method_open_bro(String bro_name,String URL_txt)
		{
			
			if(bro_name=="firefox")
				dri = new FirefoxDriver();
			dri.get(URL_txt);
			
			return dri;
			
		}
		
		public void method_click_link(WebDriver dri,String intxt)
		{
			
			WebElement ele = dri.findElement(By.linkText(intxt));
			ele.click();
			
		}
		
		public void method_close()
		{
			
			dri.quit();			
		}
		
		public String method_read_prop(String key)
		{
			
			Properties prop = new Properties();
			FileInputStream input = null;
			
			try
			{
				
				input = new FileInputStream("OR.properties");
				prop.load(input);
				Key_Value = prop.getProperty(key);
				
				
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
			
			return Key_Value;
						
		}
		
		public WebElement method_find_element(WebDriver dri,String intxt)
		{
			
			ele = dri.findElement(By.id(intxt));
			return ele;
			
		}


}
