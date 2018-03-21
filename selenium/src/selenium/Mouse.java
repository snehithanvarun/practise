package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws IOException {
		BaseClass b=new BaseClass();
		WebDriver driver =b.getDriver("http://www.greenstechnologys.com/");
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions acc=new Actions(driver);
		acc.moveToElement(course).build().perform();
		WebElement orac=driver.findElement(By.xpath("//a[text()='Oracle']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",orac);
		WebElement soft=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		acc.moveToElement(soft).build().perform();
		b.screenshot(driver,"shot");
		 WebElement sel=driver.findElement(By.xpath("//span[text()='Selenium']"));
		 acc.moveToElement(sel).build().perform();
		 b.screenshot(driver,"selenium");
		 
		
	}

}
