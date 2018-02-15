package com.info.test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.CaptureScreenShots;

public class ScreenShot {
	
	 WebDriver driver ;
	public static void main(String[] args) throws InterruptedException, IOException {
		ScreenShot s = new ScreenShot();
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/Flights");
		Thread.sleep(2000);
		CaptureScreenShots.takeScreenShot(driver);
		
		s.closeBrowser( driver);
		
		
	}
	
	
	public   void closeBrowser( WebDriver driver){
		
		
		driver.close();
		
		
	}
	
}
