package testing;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bing.com/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Ignore
	@Test
	public void methodTest() throws InterruptedException {
		WebElement webEle = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		webEle.sendKeys("flluffy kittens");
		webEle.submit();
		
		Thread.sleep(3000);
	}
	
//	@Test
//	public void screenshotTest() {
//
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Pictures\\screenshotTest.png"));
//		
//	}
	
}
