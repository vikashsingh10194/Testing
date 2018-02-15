package com.info.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver ;
	@Test
	public  void brwserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			
			
	/*	System.out.println("launching chrome browser");
		driver.get("https://www.youtube.com/watch?v=BtmeQOcdIKI");
		String s = driver.getTitle();
		System.out.println(s);     */
	}
}
