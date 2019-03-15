package com.qa.draw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draw {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void drawTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"brush\"]")).click();

		Actions action = new Actions(driver);

		action.moveByOffset(600, 400).clickAndHold().moveByOffset(0, 200).clickAndHold().moveByOffset(50, -50).clickAndHold().moveByOffset(-50, -50).clickAndHold().moveByOffset(50, -50).clickAndHold().moveByOffset(-50, -50).release().perform();
		action.moveByOffset(100, 200).clickAndHold().moveByOffset(0, -100).clickAndHold().moveByOffset(50, 0).release().perform();
		action.moveByOffset(50, 0).clickAndHold().moveByOffset(0,100).clickAndHold().moveByOffset(50,0).clickAndHold().moveByOffset(0, -100).release().perform();
		action.moveByOffset(50, 0).clickAndHold().moveByOffset(0,100).clickAndHold().moveByOffset(0,-75).clickAndHold().moveByOffset(25, -25).clickAndHold().moveByOffset(25, 25).clickAndHold().moveByOffset(0, 75).release().perform();
		action.moveByOffset(100, -50).clickAndHold().moveByOffset(-25,-50).clickAndHold().moveByOffset(-25,50).clickAndHold().moveByOffset(25, 50).clickAndHold().moveByOffset(25, -50).release().perform();

//		action.moveByOffset(50, -100).clickAndHold().moveByOffset(0, 200).clickAndHold().moveByOffset(50, -100).clickAndHold().moveByOffset(-50, -100).release().perform();
//		action.moveByOffset(150, 150).clickAndHold().moveByOffset(-25,-50).clickAndHold().moveByOffset(-25,50).clickAndHold().moveByOffset(25, 50).clickAndHold().moveByOffset(25, -50).release().perform();
//		action.moveByOffset(50, 0).clickAndHold().moveByOffset(0,100).clickAndHold().moveByOffset(50,0).clickAndHold().moveByOffset(0, -100).release().perform();
		
		
		Thread.sleep(8000);
				
		
	}

}
