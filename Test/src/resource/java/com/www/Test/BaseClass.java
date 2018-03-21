package com.www.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver getdriver(String link) {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(link);
      return driver;
	}
	
	public static void inputtext(WebElement entry, String data)
	{
		
        entry.sendKeys(data);
	}
	
	public static void click(WebElement tuck) 
	{
		
           tuck.click();
	}
	public static void closeApplication(WebDriver driver) {
		// TODO Auto-generated method stub
			driver.quit();
	}
	
	
	
}
