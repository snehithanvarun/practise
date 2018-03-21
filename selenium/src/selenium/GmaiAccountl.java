package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmaiAccountl {

	public static void main(String[] args) throws IOException {
		launch();
		
	}

	private static void launch() throws IOException {
		BaseClass b=new BaseClass();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    WebElement  firstName= driver.findElement(By.name("firstname"));
	    firstName.sendKeys("varun");
	    b.screenshot(driver, "snehithan");
	    WebElement lastName= driver.findElement(By.name("lastname"));
	    lastName.sendKeys("m");
	    WebElement email= driver.findElement(By.name("reg_email__"));
	    email.sendKeys("snehithanvarun93@gmail.com");
	    WebElement password= driver.findElement(By.name("reg_passwd__"));
	    password.sendKeys("asdf1234$");
	    b.screenshot(driver, "snehithan1");
	    WebElement sex= driver.findElement(By.xpath("//input[@value='2']"));
	    sex.click();
	    WebElement submit= driver.findElement(By.name("websubmit"));
	    submit.click();
	  
	}}
