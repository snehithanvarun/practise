package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		drag();
		
	}

	public static void drag() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement From = driver.findElement(By.id("credit2"));
WebElement to = driver.findElement(By.id("bank"));
Actions acc=new Actions(driver);
acc.dragAndDrop(From,to).build().perform();

	}




}
