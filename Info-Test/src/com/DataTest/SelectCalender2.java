package com.DataTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalender2 {
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.orbitz.com/Flights");
	Thread.sleep(4000);
	
	//String dateString = "25 APR 2018";
	driver.findElement(By.id("flight-departing")).click();
	Thread.sleep(2000);
	List<WebElement> data =driver.findElements(By.xpath(".//*[@class='datepicker-cal-month']/table[1]//td"));
	int tsize = data.size();
	for(int i =0;i<=tsize;i++){
		String date = data.get(i).getText();
		if(date.equals("30")){
			data.get(i).click();
			
			
		}
	}
}
}