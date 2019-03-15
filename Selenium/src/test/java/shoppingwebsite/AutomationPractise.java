package shoppingwebsite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise {
	
WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() {

		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("dress");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).isDisplayed());
		
		
		
		
		
	}

}
