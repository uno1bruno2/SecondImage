package travelsite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PhPTravel {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() {
		driver.findElement(By.cssSelector("body > div.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active > div > input")).sendKeys("london");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")));
		
//		
//	
//		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//		
//		homePage.searchForHotel("Sponge", "poo", "cow", 2);
		
	}

}
