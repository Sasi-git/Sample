package testAUTArchive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.sikuli.script.Screen;

public class Count_Words 
{

	public static void main(String[] args)
	 {

	      	WebDriver driver = new FirefoxDriver();
	      	driver.navigate().to("http://www.tizag.com/htmlT/htmlparagraphs.php");
	      	String text;
	      	int len,i,counter=1;	      	
	      	
//	      	Screen screen = new Screen();
	    
	       text= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr/td/div[4]/p")).getText().toString();
	       len=text.length();
	       System.out.println("Lentgh of chars - "+len);
	       
	       for(i=1;i<len;i++)
	       {
	    	   
	    	   if(text.charAt(i)==' ')
	    	   {
	    		   
	    		   counter++;
	    		   
	    	   }
	    	   
	       }
	       
	       System.out.println("Words - "+counter);
	       
	       
	       //For Counting Duplicate words
	       int len2=counter/((int)2);
	       text=text.trim();
	       String[] words = text.split(" ");
	       int counter1 = 0;
	      for(i=0;i<=len2;i++)
	      {
	       	       
	       for(int j=0;j<=len2;j++)
	       {
	    	   
	    	   if(words[i]==words[j])
	    	   {
	        	
	    		   System.out.print(words[i]);
	    		   System.out.print("---");
	    		   System.out.print(words[j]);
	    		   System.out.println();
	    		   counter1++;
	            
	    	   }	        
	            
	       	}
	           	      
	      	}
	      	System.out.println("len2 - "+len2);
	      	System.out.println("counter 1 - "+counter1);
	       
	       driver.quit();
	 }
	
	
/*	public static void main(String[] args)
	 {

	      WebDriver driver = new FirefoxDriver();
	      driver.navigate().to("http://www.tizag.com/htmlT/htmlparagraphs.php");
	       String text;
	       int len;
	       int i;
	    
	     text= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr/td/div[4]/p")).getText().toString();
	      len=text.length();
	  
	      int counter=0;
	      for (i=0;i<=len-1;i++)
	      {
	     
	       if(Character.isLetter(text.charAt(i)))
	       {
	        counter++;
	        for(;i<=len-1;i++)
	        {
	         if(text.charAt(i)==' '){
	          counter++;
	                      }
	              }
	        }
	       }
	       System.out.print(counter);
	       System.out.print("\n");
	 }*/
}
