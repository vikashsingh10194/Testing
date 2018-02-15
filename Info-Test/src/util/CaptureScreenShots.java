package util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShots {
	
	public static void takeScreenShot(WebDriver driver){
		
		
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //The below method will save the screen shot in d drive with name "screenshot.png"
	           FileUtils.copyFile(scrFile, new File("\\Info-Test\\Screenshot\\laxmi.png"));
			System.out.println("Screenshot is captured");
			
		}
		catch(Exception e){
			System.out.println("error message" +e.getMessage());
			
			
		}
	}

}
