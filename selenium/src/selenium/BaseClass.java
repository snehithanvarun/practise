package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.util.Output;

public class BaseClass {
	
	public WebDriver getDriver(String Url) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehithan\\eclipse-sample\\selenium\\driver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get(Url);
   return driver;
   

	}
	public void screenshot(WebDriver driver,String filename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File scrcFile=tk.getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\Snehithan\\Pictures\\Screenshots\\"+filename+".png");
	FileUtils.copyFile(scrcFile, Dest);
	
	}
	
}
