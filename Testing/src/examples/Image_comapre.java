package examples;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Image_comapre 
{	
	public static void main(String args[])
	{
		
		processImage();
		
	}
	public static String processImage() 
	{
	  System.out.println("Executing processImage Keyword");

	  try 
	  {
	   String file1 = "E:\\images.JPEG";
	   String file2 = "E:\\images2.JPEG";

	   Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
	   Image image2 = Toolkit.getDefaultToolkit().getImage(file2);

	   try 
	   {

	    PixelGrabber grab1 = new PixelGrabber(image1, 0, 0, -1, -1,
	      false);
	    PixelGrabber grab2 = new PixelGrabber(image2, 0, 0, -1, -1,
	      false);

	    int[] data1 = null;

	    if (grab1.grabPixels()) 
	    {
	     int width = grab1.getWidth();
	     int height = grab1.getHeight();
	     data1 = new int[width * height];
	     data1 = (int[]) grab1.getPixels();
	    }

	    int[] data2 = null;

	    if (grab2.grabPixels()) 
	    {
	     int width = grab2.getWidth();
	     int height = grab2.getHeight();
	     data2 = new int[width * height];
	     data2 = (int[]) grab2.getPixels();
	    }

	    System.out.println("Pixels equal: "+ java.util.Arrays.equals(data1, data2));

	   } 
	   catch (InterruptedException e1) 
	   {
	    e1.printStackTrace();
	   }
	   return "Pass";
	  } 
	  catch (Throwable t) 
	  {
	   // report error
	   return "Fail - " + t.getMessage();
	  }

	 }
	
}
