package jquery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Testing 
{
	
	Properties prop = new Properties();
	FileInputStream input = null;
	String key = "Drop";
	String value = null;
	
	@Test
	public void method_test() throws IOException
	{
		
		input = new FileInputStream("OR.properties");
		prop.load(input);
		value = prop.getProperty(key);
		System.out.println(value);
		
	}
	
}
