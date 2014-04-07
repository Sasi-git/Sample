package examples;

import java.io.IOException;

public class TestBatchExec 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		final Runtime rt = Runtime.getRuntime();
	      try 
	      {
	         Process p = rt.exec("cmd /C start E:\\WD_Test.bat");
	         Thread.sleep(3000);
//	         p.destroy();
	         System.out.println("Code Executed successfully");
	      } 
	      catch (final IOException e) 
	      {
	         throw new RuntimeException("Failed to run bat file.");
	      }

	}

}
