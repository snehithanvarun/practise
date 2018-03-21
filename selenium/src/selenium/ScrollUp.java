package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;

public class ScrollUp {
public static void main(String[] args) {
	scrollup();
	
}

private static void scrollup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demoqa.com/");
	WebElement txt=driver.findElement(By.id("ui-id-2"));
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("arguments[0].scrollIntoView(true);",txt);
}
}
