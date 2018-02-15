package com.DataTest;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectCalender {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.orbitz.com/Flights");
		Thread.sleep(2000);
		
		String dateString = "25 APR 2018";
		driver.findElement(By.id("flight-departing")).click();
		List<WebElement> months = driver.findElements(By.xpath(".//*[@class='datepicker-cal-month']"));
		WebElement forwardArrow = driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper']/div/div/button[2]"));
		for (WebElement month : months) {
			WebElement headerElement = month.findElement(By.xpath(".//*[@class='datepicker-cal-month-header']"));
			if (headerElement.getText().contains("APR 2018")) {
				List<WebElement> dates = month.findElements(By.xpath(".//*[@class='datepicker-day-number notranslate']"));
				Thread.sleep(2000);
				for (WebElement date : dates) {
					if (date.getAttribute("data-day").contains("25")) {
						date.click();
					}
				}
				break;
			}else{
				forwardArrow.click();
			}
		}
	}


}
