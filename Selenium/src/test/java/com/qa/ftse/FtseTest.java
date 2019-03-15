package com.qa.ftse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class FtseTest {
	
	WebDriver driver;
	
	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void riser() {
//		driver.findElement(By.cssSelector("#view-constituents > ul > li:nth-child(2) > a")).click();

		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers");
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		assertEquals("WPP plc should be expected","WPP plc",landingPage.maxRiser());
	}

	@Test
	public void faller() {
//		driver.findElement(By.cssSelector("#view-constituents > ul > li:nth-child(3) > a")).click();
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers");
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		assertEquals("Rightmove plc should be expected","Rightmove plc",landingPage.maxFaller());
	}

}
