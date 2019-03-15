package shafeeq;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shafeeq {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://christophperrins.github.io/TestingSite/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"quote\"]/h2")).isDisplayed());
	}
	
}
