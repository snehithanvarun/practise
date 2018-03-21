package org.openqa;

import java.util.Set;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {
	
	
		public static void main (String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
			WebDriver   driver =new ChromeDriver();
			   driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
			  String pwin = driver.getWindowHandle();
			   
			   WebElement obj=driver.findElement(By.xpath("//a[@href='javascript:forgetPassword();']"));
			   obj.click();
			   Set<String> sewin = driver.getWindowHandles();
			   
			   for (String y: sewin)
			   {
				   if (!pwin.equals(y))
				   {
					   driver.switchTo().window(y);
				   }
			   }
			      
			   
			 WebElement secpage =  driver.findElement(By.xpath("// a[text()='Reset Login password']"));
			   secpage.click();
					   
			WebElement obj1 = driver.findElement(By.id("fldUId"));
			   obj1.sendKeys("hfgdh");
			   
			   WebElement btncl =  driver.findElement(By.xpath("// a[text()='submit']"));
	
			   btncl.click();
			   
			   WebElement text =  driver.findElement(By.xpath("//td[@class='ColHeadingLeftAlignedBold']"));
				System.out.println(text);
			   if(text.isDisplayed()) {
				   
				   System.out.println(text.getText());
			   }else {
				   System.out.println("Fail");
			   }
			   
			   
			
			   
		}

	}


