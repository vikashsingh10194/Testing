package com.info.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertverify {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		String str = driver.getTitle();
		String strg = "Google.com";
		System.out.println(str);
		Assert.assertEquals(str, str);
		System.out.println("test case is passed");
		
		
	}
}
