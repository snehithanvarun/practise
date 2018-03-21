package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
		public static void main(String[] args) {
			Selenium s=new Selenium();
			s.launchBrowser();
		
		}
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en");
			WebElement firstName=driver.findElement(By.name("FirstName"));
			firstName.sendKeys("snehithan");
			WebElement lastName=driver.findElement(By.name("LastName"));
			lastName.sendKeys("va");
			
			WebElement email=driver.findElement(By.id("GmailAddress"));
			email.sendKeys("sehithanvarun");
			WebElement passwrd=driver.findElement(By.name("Passwd"));
			passwrd.sendKeys("varunsunglas27*$");
			WebElement passwordagain=driver.findElement(By.id("PasswdAgain"));
		    passwordagain.sendKeys("varunsunglas27*$");

			WebElement birthday=driver.findElement(By.id("BirthDay"));
		    birthday.sendKeys("22");

			WebElement birthyear=driver.findElement(By.id("BirthYear"));
		    birthyear.sendKeys("1993");

			WebElement mobNumber=driver.findElement(By.id("RecoveryPhoneNumber"));
			mobNumber.sendKeys("9445480620");

			WebElement curretEmail=driver.findElement(By.id("RecoveryEmailAddress"));
			curretEmail.sendKeys("snehithanvarun93@gmail.com");

			WebElement nxtButton=driver.findElement(By.xpath("//input[@id='submitbutton']"));
		    nxtButton.click();
		}
	
		}
	


