package com.qa.modification;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://bing.com/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.searchFor("Chickens");
	}

}
