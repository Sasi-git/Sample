package sikuli;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliTest 
{

public Screen screen;
    
    @Test
    public void tesSikuli() throws InterruptedException, FindFailed, AWTException
    {
        
    	Robot robot = new Robot();
    	
    	//open note pad application
        screen =new  Screen();
        App.open("notepad.exe");
        Thread.sleep(2000);
        
        //type text notepad
        screen.type("Images/InputFiled.png", "Testing sikuli with Test NG");
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        
        //click on file menu
//        screen.click("Images/FileMenu.png", 20);
//        Thread.sleep(2000);
//        
//        //click on save submenu
//        screen.click("Images/SavesubMenu.png", 20);
//        Thread.sleep(2000);
                        
        //select file input field and type path 
        screen.click("Images/FilePathInput.png", 20);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_BACK_SLASH);
        
        screen.type("Images/FilePathInput.png", "E:\\test.txt");
        Thread.sleep(2000);
        
        //click save button
        screen.click("Images/SaveButton.png", 20);
        Thread.sleep(2000);    
        
    }
	
}
