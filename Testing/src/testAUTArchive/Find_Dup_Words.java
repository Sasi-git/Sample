package testAUTArchive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Dup_Words 
{
	public static void main(String args[])
	{
		
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://www.tizag.com/htmlT/htmlparagraphs.php");
			String text;
			int len,i,j,words_len;
			String[] words;
	  
			text= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr/td/div[4]/p")).getText().toString();
			len=text.length();
			System.out.println("Lentgh of chars - "+len);
			words = text.split(" ");
			System.out.println("words length - "+words.length);
			words_len = words.length;
			
			for(i=0;i<words_len-1;i++)
		       {
		    	   
					for(j=i+1;j<words_len-1;j++)
					{
						
						if(words[i].equals(words[j]))
						{
							
							System.out.println("Duplicate - "+words[i]+"("+i+") = "+words[j]+"("+j+")");
							
						}
						
					}
		    	   		    	   
		       }
		
	}
		
}
