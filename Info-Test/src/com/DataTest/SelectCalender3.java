package com.DataTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalender3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/Flights");
		Thread.sleep(4000);
		String dateString = "25";	
		String monthYearString = "MAY 2018";		
		driver.findElement(By.id("flight-departing")).click();
		boolean dateSelected = false;
		WebElement backWardArrow  = driver.findElement(By.xpath(".//button[contains(@class,'datepicker-paging datepicker-prev btn-paging')]"));		
		WebElement forwardArrow = driver.findElement(By.xpath(".//button[contains(@class,'datepicker-paging datepicker-next btn-paging')]"));
	
		List<WebElement> monthYear = driver.findElements(By.className("datepicker-cal-month-header"));			
		while(!dateSelected){		
			for (WebElement monthYearHeader : monthYear) {			
				if (monthYearHeader.getAttribute("innerHTML").contains(monthYearString)) {				
					dateSelected =true;					
					break;				}			}		
			forwardArrow.click();		}
		
		
		
	}

}
