package com.pom.Pom;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get(url);
		   return driver;
		   
	}
	
/*	public void takeScreenShot(WebDriver driver,String filename) throws IOException {
		// TODO Auto-generated method stub
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    java.io.File srcFile=ts.getScreenshotAs(OutputType.FILE);
		    java.io.File dest=new java.io.File("C:\\Users\\Snehithan\\Pictures\\Saved Pictures\\"+filename+".png");
	}
*/	public static void setText(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void rightClick(WebDriver driver,WebElement element) {
		// TODO Auto-generated method stub
		Actions acc=new Actions(driver);
		acc.contextClick(element).build().perform();
		
	}
}
